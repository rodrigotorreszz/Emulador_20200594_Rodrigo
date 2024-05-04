package rodrigo.torres.emulador_20200594_rodrigo.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import rodrigo.torres.emulador_20200594_rodrigo.R
import rodrigo.torres.emulador_20200594_rodrigo.databinding.FragmentDashboardBinding
import java.lang.Exception

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val btnImprimir = root.findViewById<Button>(R.id.btnImprimir)

        btnImprimir.setOnClickListener {


            try {
                Toast.makeText(
                    context,
                    "hola buenas, mi nombre es Rodrigo Leonel Torres Escobar",
                    Toast.LENGTH_SHORT
                ).show()

            } catch (e: Exception) {
                println(e)
            }

        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
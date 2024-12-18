package X;

import android.app.AlertDialog;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.ScaleGestureDetector;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.facebook.R;
import com.facebook.smartcapture.view.BaseSelfieCaptureActivity;
import com.facebook.smartcapture.view.IdCaptureActivity;
import java.util.List;

/* renamed from: X.LRq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48116LRq implements YNN {
    public final int A00;
    public final Object A01;

    public C48116LRq(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.YNN
    public final /* bridge */ /* synthetic */ Object Eq4(Y6Z y6z) {
        switch (this.A00) {
            case 0:
                if (y6z.A06()) {
                    ((RunnableC73528YHy) this.A01).A02.A00();
                    return null;
                }
                boolean A07 = y6z.A07();
                C72862XpO c72862XpO = ((RunnableC73528YHy) this.A01).A02;
                if (A07) {
                    c72862XpO.A01(y6z.A03());
                    return null;
                }
                c72862XpO.A02(y6z.A04());
                return null;
            case 1:
                C14360o3.A0B(y6z, 0);
                Object A04 = y6z.A04();
                C14360o3.A07(A04);
                boolean A1a = AbstractC166987dD.A1a(A04);
                C64094SzB c64094SzB = (C64094SzB) this.A01;
                if (A1a) {
                    InterfaceC65547TmM interfaceC65547TmM = (InterfaceC65547TmM) c64094SzB.A0K.get();
                    if (interfaceC65547TmM != null) {
                        EnumC61101RfG enumC61101RfG = c64094SzB.A03;
                        IdCaptureActivity idCaptureActivity = (IdCaptureActivity) interfaceC65547TmM;
                        C14360o3.A0B(enumC61101RfG, 0);
                        AbstractC43592JPx.A08(idCaptureActivity).post(new TOB(enumC61101RfG, idCaptureActivity));
                    }
                } else {
                    c64094SzB.A03();
                }
                return C0eB.A00;
            case 2:
                C14360o3.A0B(y6z, 0);
                if (!y6z.A07() && !y6z.A06() && y6z.A04() != null) {
                    K5O k5o = (K5O) this.A01;
                    k5o.A05 = (List) y6z.A04();
                    AbstractC167007dF.A0x(k5o.A03);
                    ViewPager viewPager = k5o.A04;
                    C14360o3.A0A(viewPager);
                    viewPager.setVisibility(0);
                    LinearLayout linearLayout = k5o.A02;
                    C14360o3.A0A(linearLayout);
                    linearLayout.setVisibility(0);
                    List list = k5o.A05;
                    C14360o3.A0A(list);
                    C44801JsQ c44801JsQ = new C44801JsQ(list);
                    ViewPager viewPager2 = k5o.A04;
                    C14360o3.A0A(viewPager2);
                    viewPager2.setAdapter(c44801JsQ);
                    ViewPager viewPager3 = k5o.A04;
                    C14360o3.A0A(viewPager3);
                    viewPager3.A0J(new C44802JsR(k5o));
                    Button button = k5o.A00;
                    C14360o3.A0A(button);
                    ViewOnClickListenerC48066LPr.A00(button, 0, c44801JsQ, k5o);
                    ImageView imageView = k5o.A01;
                    C14360o3.A0A(imageView);
                    LQ0.A02(imageView, 0, k5o);
                    return null;
                }
                Fragment fragment = (Fragment) this.A01;
                FragmentActivity requireActivity = fragment.requireActivity();
                boolean z = requireActivity instanceof InterfaceC50382MMk;
                ContextThemeWrapper contextThemeWrapper = requireActivity;
                if (z) {
                    contextThemeWrapper = new ContextThemeWrapper(requireActivity, ((BaseSelfieCaptureActivity) ((InterfaceC50382MMk) requireActivity)).A02().A00);
                }
                new AlertDialog.Builder(contextThemeWrapper).setTitle(R.string.res_0x7f1300d1_name_removed).setMessage(R.string.res_0x7f1300d0_name_removed).setPositiveButton(R.string.res_0x7f1300d5_name_removed, DialogInterfaceOnClickListenerC48023LMs.A00(fragment, 0)).setNegativeButton(R.string.res_0x7f1300ac_name_removed, DialogInterfaceOnClickListenerC48023LMs.A00(fragment, 1)).show();
                return null;
            default:
                C14360o3.A0B(y6z, 0);
                K5S k5s = (K5S) this.A01;
                ImageView imageView2 = k5s.A0D;
                C14360o3.A0A(imageView2);
                imageView2.setImageDrawable((Drawable) y6z.A04());
                ImageView imageView3 = k5s.A0D;
                C14360o3.A0A(imageView3);
                imageView3.animate().alpha(1.0f).withEndAction(new RunnableC49820LzR(k5s)).start();
                LinearLayout linearLayout2 = k5s.A0I;
                C14360o3.A0A(linearLayout2);
                linearLayout2.animate().alpha(1.0f).start();
                FrameLayout frameLayout = k5s.A0B;
                C14360o3.A0A(frameLayout);
                frameLayout.post(new RunnableC49821LzS(k5s));
                k5s.A07 = new ScaleGestureDetector(k5s.requireContext(), new C50778Mbk(k5s, 0));
                FrameLayout frameLayout2 = k5s.A0B;
                C14360o3.A0A(frameLayout2);
                ViewOnTouchListenerC48084LQj.A01(frameLayout2, 0, k5s);
                return null;
        }
    }
}

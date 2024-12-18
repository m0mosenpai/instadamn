package X;

import android.R;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.WtP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71401WtP implements Runnable {
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ FK5 A01;

    public RunnableC71401WtP(FrameLayout frameLayout, FK5 fk5) {
        this.A01 = fk5;
        this.A00 = frameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FK5 fk5 = this.A01;
        FrameLayout frameLayout = this.A00;
        Context context = fk5.A01;
        boolean A00 = AbstractC72723Nt.A00(context);
        FrameLayout frameLayout2 = fk5.A00;
        if (frameLayout2 == null) {
            frameLayout2 = new FrameLayout(context);
            fk5.A00 = frameLayout2;
        }
        AbstractC43593JPy.A1B(frameLayout2, -1);
        int i = R.color.white;
        if (A00) {
            i = R.color.black;
        }
        AbstractC31173DnH.A0z(context, frameLayout2, i);
        frameLayout2.setClickable(true);
        frameLayout.addView(frameLayout2);
        EnumC191908em C73 = AbstractC25291Lj.A00.C73();
        Integer num = C05F.A0C;
        C14360o3.A0B(num, 1);
        U51 u51 = new U51(context, num);
        int A03 = AbstractC25291Lj.A03(EnumC72394Xcg.A2M, u51.CSL());
        EnumC68205VFx enumC68205VFx = EnumC68205VFx.A08;
        float[] fArr = new float[8];
        fArr[0] = 0.0f;
        AbstractC43594JPz.A1U(fArr, 0.0f, 1);
        AbstractC167017dG.A1X(fArr, 0.0f);
        frameLayout2.addView(new C66213U4j(context, C73, enumC68205VFx, u51, fArr, 0.08f, A03));
        ViewGroup viewGroup = (ViewGroup) frameLayout2.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(frameLayout2);
        }
        frameLayout.addView(frameLayout2);
    }
}

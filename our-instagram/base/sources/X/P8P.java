package X;

import android.content.Context;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.List;

/* loaded from: classes9.dex */
public final class P8P implements InterfaceC140606Xo {
    public final /* synthetic */ Reel A00;
    public final /* synthetic */ C3G2 A01;
    public final /* synthetic */ C38E A02;
    public final /* synthetic */ GradientSpinnerAvatarView A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ List A06;

    public P8P(Reel reel, C3G2 c3g2, C38E c38e, GradientSpinnerAvatarView gradientSpinnerAvatarView, List list, List list2, List list3) {
        this.A02 = c38e;
        this.A03 = gradientSpinnerAvatarView;
        this.A00 = reel;
        this.A04 = list;
        this.A06 = list2;
        this.A05 = list3;
        this.A01 = c3g2;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, X.MTo] */
    @Override // X.InterfaceC140606Xo
    public final void Cge(long j, boolean z) {
        GradientSpinnerAvatarView gradientSpinnerAvatarView = this.A03;
        gradientSpinnerAvatarView.A0A();
        C38E c38e = this.A02;
        Reel reel = this.A00;
        List list = this.A04;
        List list2 = this.A06;
        List list3 = this.A05;
        Context context = c38e.A0L.getContext();
        ?? obj = new Object();
        obj.A02 = gradientSpinnerAvatarView;
        obj.A00 = context;
        C38E.A01(reel, this.A01, c38e, obj, null, list, list2, list3, j, z);
    }
}

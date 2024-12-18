package X;

import android.view.View;
import com.instagram.model.reels.Reel;

/* renamed from: X.DrO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C31419DrO extends C03E implements InterfaceC16610sE {
    public C31419DrO(Object obj) {
        super(3, obj, C31410DrF.class, "launchReelViewer", "launchReelViewer(Landroid/view/View;Lkotlin/jvm/functions/Function0;Lcom/instagram/model/reels/Reel;)V", 0);
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        Reel reel = (Reel) obj3;
        AbstractC167017dG.A1O(view, reel);
        C31410DrF c31410DrF = (C31410DrF) this.receiver;
        C38E c38e = c31410DrF.A02;
        c38e.A05 = new C31559Dtj(c31410DrF.A00, view, new GF3(obj2, 17));
        c38e.A0C = AbstractC166997dE.A0n();
        c38e.A06(reel, C3G2.A0Q, null, AbstractC166987dD.A1J(reel), AbstractC166987dD.A1J(reel), AbstractC166987dD.A1J(reel));
        return C0eB.A00;
    }
}

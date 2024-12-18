package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.MessageQueue;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CropInfo;
import java.io.File;

/* renamed from: X.JZl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43823JZl extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43823JZl(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        super(0);
        this.A00 = i2;
        this.A03 = obj;
        this.A05 = obj2;
        this.A04 = obj3;
        this.A01 = i;
        this.A02 = obj4;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                Context context = (Context) this.A03;
                LHx lHx = (LHx) this.A05;
                C15100pQ c15100pQ = (C15100pQ) this.A04;
                int i = this.A01;
                C57I c57i = (C57I) this.A02;
                AbstractC09790fc.A01("MetaComposeViewPool#queueIdle", -1533671705);
                try {
                    try {
                        C57h c57h = new C57h(context);
                        c57h.A07(c57i);
                        MessageQueue messageQueue = LHx.A02;
                        lHx.A00.add(c57h);
                    } catch (Exception e) {
                        android.util.Log.e("MetaComposeViewPool", AbstractC167017dG.A0n(e, "Failed to prepare views: ", AbstractC166987dD.A1C()), e);
                    }
                    boolean z = true;
                    int i2 = c15100pQ.A00 + 1;
                    c15100pQ.A00 = i2;
                    if (i2 >= i) {
                        z = false;
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    AbstractC09790fc.A00(599858048);
                    return valueOf;
                } catch (Throwable th) {
                    AbstractC09790fc.A00(-1861452310);
                    throw th;
                }
            case 1:
                long A00 = ((C25261BFz) this.A05).A00(AbstractC25248BFh.A00(Float.MAX_VALUE, Float.MAX_VALUE));
                long A002 = AbstractC119395aw.A00(Float.intBitsToFloat(AbstractC25225BEi.A06(A00)), C25242BFb.A00(A00));
                C6MY c6my = (C6MY) this.A02;
                InterfaceC118485Xk interfaceC118485Xk = AbstractC118445Xg.A06;
                CQ6 cq6 = (CQ6) this.A04;
                if (C119365at.A00(((C119365at) AbstractC28007CWe.A01(c6my, interfaceC118485Xk, AbstractC25225BEi.A0R(AbstractC43593JPy.A08(cq6.A00.A04)), AbstractC25225BEi.A0R(A002))).A00) > this.A01) {
                    ((InterfaceC16660sJ) this.A03).invoke(AbstractC25225BEi.A0R(A002));
                    break;
                } else {
                    AbstractC166987dD.A1Z(new MBs(cq6, (InterfaceC23621Ds) null, 8, A002), cq6.A01);
                    break;
                }
            case 2:
            case 3:
            default:
                UserSession userSession = (UserSession) this.A05;
                int i3 = this.A01;
                C87T c87t = (C87T) this.A04;
                C87Q c87q = (C87Q) this.A03;
                C8ZC c8zc = (C8ZC) this.A02;
                AbstractC25233BEq.A0w(1, userSession, c87t, c87q);
                return new C8ZD(c87t, userSession, c87q, c8zc, i3);
            case 4:
                C47Z c47z = (C47Z) this.A04;
                File file = (File) this.A05;
                int i4 = this.A01;
                C55201OeB.A02(c47z, file, i4, i4, 50);
                C55105ObK c55105ObK = (C55105ObK) this.A02;
                Context context2 = (Context) this.A03;
                c55105ObK.A02(context2, new CropInfo(new Rect(0, 0, i4, i4), i4, i4), 0, false);
                c55105ObK.A05(context2, file.getAbsolutePath());
                break;
            case 5:
                C47777L8c c47777L8c = (C47777L8c) this.A04;
                if (c47777L8c != null) {
                    c47777L8c.A00();
                }
                C77453dV.A06((FragmentActivity) this.A03, (ClipsViewerConfig) this.A02, ((L6G) this.A05).A00, this.A01);
                break;
            case 6:
                ((InterfaceC43438JHc) this.A02).DmV((C3Y6) this.A03, (C38321qM) this.A04, null, (C75113Zb) this.A05, this.A01);
                break;
            case 7:
                AbstractC43594JPz.A1O(this.A02);
                ((InterfaceC16610sE) this.A04).invoke(((C26010Bey) this.A03).A04, Integer.valueOf(this.A01), this.A05);
                break;
        }
        return C0eB.A00;
    }
}

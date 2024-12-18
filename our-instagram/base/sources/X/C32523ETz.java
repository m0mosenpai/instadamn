package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.model.reels.Reel;

/* renamed from: X.ETz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32523ETz extends C1P1 {
    public final Context A00;
    public final Fragment A01;
    public final Reel A02;
    public final C6WQ A03;
    public final boolean A04;
    public final /* synthetic */ C35904FtO A05;

    public C32523ETz(Fragment fragment, C35904FtO c35904FtO, Reel reel, boolean z) {
        this.A05 = c35904FtO;
        this.A01 = fragment;
        Context requireContext = fragment.requireContext();
        this.A00 = requireContext;
        this.A04 = z;
        this.A03 = new C6WQ(requireContext);
        this.A02 = reel;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1052427689);
        this.A03.dismiss();
        Context context = this.A00;
        C9GR.A03(context, context.getString(2131976159), "UpdateHighlight_unknown_error_occured", 0);
        C0f9.A0A(-1430250318, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(2133866167);
        Context context = this.A00;
        int i = 2131972340;
        if (this.A04) {
            i = 2131952471;
        }
        String string = context.getString(i);
        C6WQ c6wq = this.A03;
        c6wq.A00(string);
        C0fJ.A00(c6wq);
        C0f9.A0A(-2017497324, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-917223137);
        EBB ebb = (EBB) obj;
        int A032 = C0f9.A03(-977703694);
        this.A03.dismiss();
        Reel reel = this.A02;
        reel.getClass();
        C35904FtO c35904FtO = this.A05;
        C38321qM c38321qM = c35904FtO.A03;
        if (c38321qM != null) {
            boolean z = this.A04;
            String id = reel.getId();
            if (z) {
                c38321qM.A4N(id);
            } else {
                c38321qM.A4O(id);
            }
        }
        int i = 2131964513;
        if (this.A04) {
            i = 2131964512;
        }
        if (ebb.A00 == null) {
            c35904FtO.A00(reel.A07(), AbstractC166997dE.A0r(this.A00.getResources(), reel.A0r, i));
            C1OU.A04(c35904FtO.A02).A0c(reel.getId());
        } else {
            Reel A0I = C1OU.A04(c35904FtO.A02).A0I(ebb.A00, true);
            c35904FtO.A00(A0I.A07(), AbstractC166997dE.A0r(this.A00.getResources(), reel.A0r, i));
            c35904FtO.A01.A05(new C3DH(A0I));
        }
        AbstractC31181DnP.A0Y(this.A01);
        C0f9.A0A(61359834, A032);
        C0f9.A0A(-1217773782, A03);
    }
}

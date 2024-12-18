package X;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: X.ETn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32512ETn extends C1P1 {
    public final WeakReference A00;

    public C32512ETn(FQZ fqz) {
        this.A00 = AbstractC25225BEi.A16(fqz);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        String A0p;
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -530379758);
        super.onFail(abstractC115105If);
        FQZ fqz = (FQZ) this.A00.get();
        if (fqz != null) {
            FMW fmw = fqz.A04;
            fmw.A03 = true;
            fmw.A00 = null;
            EJX ejx = fqz.A08;
            ejx.A00(fqz.A06.A00(fmw, AbstractC31173DnH.A0L(fqz.A07.A00)));
            Context context = fqz.A02;
            InterfaceC40821up A0L = AbstractC31172DnG.A0L(abstractC115105If);
            if (A0L == null || (A0p = A0L.getErrorMessage()) == null || A0p.length() <= 0) {
                A0p = AbstractC166997dE.A0p(context, 2131968430);
            }
            if (ejx.isAdded()) {
                C9GR.A03(ejx.getActivity(), A0p, "GlobalBlocksContract onFetchFailed", 1);
            }
        }
        C0f9.A0A(828163269, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(1241410313);
        super.onFinish();
        FQZ fqz = (FQZ) this.A00.get();
        if (fqz != null) {
            FMW fmw = fqz.A04;
            fmw.A02 = false;
            fmw.A00 = null;
        }
        C0f9.A0A(-1315353771, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1538295923);
        C32201ECw c32201ECw = (C32201ECw) obj;
        int A032 = C0f9.A03(-1150406050);
        C14360o3.A0B(c32201ECw, 0);
        super.onSuccess(c32201ECw);
        FQZ fqz = (FQZ) this.A00.get();
        if (fqz != null) {
            FMW fmw = fqz.A04;
            boolean z = false;
            fmw.A03 = false;
            fmw.A00 = null;
            String str = c32201ECw.A01;
            if (str != null) {
                z = true;
            }
            fmw.A01 = z;
            fmw.A00 = null;
            fqz.A00 = str;
            C34946FaW c34946FaW = fqz.A07;
            Iterator A0i = AbstractC31177DnL.A0i(c32201ECw.A02);
            while (A0i.hasNext()) {
                EB0 eb0 = (EB0) A0i.next();
                c34946FaW.A00.add(eb0);
                c34946FaW.A01.put(eb0.A04, eb0);
            }
            C34946FaW.A00(c34946FaW);
        }
        C0f9.A0A(-786776784, A032);
        C0f9.A0A(426376440, A03);
    }
}

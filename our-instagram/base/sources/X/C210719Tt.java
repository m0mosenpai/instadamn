package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;

/* renamed from: X.9Tt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210719Tt extends Fragment implements BDZ {
    public int A00;
    public int A01;
    public int A02;
    public View A03;
    public C9TT A04;
    public boolean A08;
    public boolean A09;
    public C23432Aa5 A0A;
    public WeakReference A07 = new WeakReference(null);
    public WeakReference A06 = new WeakReference(null);
    public WeakReference A05 = new WeakReference(null);

    @Override // X.BDZ
    public final void D1S(Exception exc) {
        C14360o3.A0B(exc, 0);
        BDZ bdz = (BDZ) this.A06.get();
        if (bdz != null) {
            bdz.D1S(exc);
        }
    }

    @Override // X.BDZ
    public final void D1b() {
        this.A08 = false;
        this.A09 = false;
    }

    public final C23432Aa5 A00() {
        C23432Aa5 c23432Aa5 = this.A0A;
        if (c23432Aa5 != null) {
            return c23432Aa5;
        }
        C14360o3.A0F("cameraController");
        throw C00O.createAndThrow();
    }

    @Override // X.BDZ
    public final void D1W() {
        C23432Aa5 A00 = A00();
        InterfaceC175067qg.A00(A00.A00.Aq0(InterfaceC180017yr.A00));
        BDZ bdz = (BDZ) this.A06.get();
        if (bdz != null) {
            bdz.D1W();
        }
    }

    @Override // X.BDZ
    public final void D1X(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        BDZ bdz = (BDZ) this.A06.get();
        if (bdz != null) {
            bdz.D1X(str, str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r4.getBoolean("use_camera2") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        r8.A0A = X.AbstractC224579vi.A00(X.AbstractC166987dD.A0O(requireActivity()), new X.C23319AVe(r8), r5, r2);
        X.C23432Aa5.A00(A00()).Egx(r7);
        X.C23432Aa5.A00(A00()).Eal(r6);
        X.C23432Aa5.A00(A00()).EbP(921600);
        X.C23432Aa5.A00(A00()).Eam(false);
        A00();
        X.C23432Aa5.A00(A00()).EaF(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a5, code lost:
    
        if (r4 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a7, code lost:
    
        r2 = X.AbstractC58317Pt9.A00(290);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b1, code lost:
    
        if (r4.containsKey(r2) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b3, code lost:
    
        A00().A03(r4.getInt(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00be, code lost:
    
        X.C0f9.A09(-2084034932, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c6, code lost:
    
        if (r4 != null) goto L15;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = 81136274(0x4d60a92, float:5.0320866E-36)
            int r3 = X.C0f9.A02(r0)
            super.onCreate(r9)
            android.os.Bundle r4 = r8.mArguments
            r0 = 914(0x392, float:1.281E-42)
            java.lang.String r1 = X.AbstractC58317Pt9.A00(r0)
            r6 = 1048576(0x100000, float:1.469368E-39)
            if (r4 == 0) goto L20
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L20
            int r6 = r4.getInt(r1)
        L20:
            r0 = 1038(0x40e, float:1.455E-42)
            java.lang.String r1 = X.AbstractC58317Pt9.A00(r0)
            r7 = 921600(0xe1000, float:1.291437E-39)
            if (r4 == 0) goto Lc5
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L35
            int r7 = r4.getInt(r1)
        L35:
            r0 = 387(0x183, float:5.42E-43)
            java.lang.String r1 = X.AbstractC58317Pt9.A00(r0)
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto Lc5
            int r0 = r4.getInt(r1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L49:
            java.lang.String r0 = "use_camera2"
            boolean r0 = r4.getBoolean(r0)
            r2 = 1
            if (r0 != 0) goto L53
        L52:
            r2 = 0
        L53:
            androidx.fragment.app.FragmentActivity r0 = r8.requireActivity()
            android.content.Context r1 = X.AbstractC166987dD.A0O(r0)
            X.AVe r0 = new X.AVe
            r0.<init>(r8)
            X.Aa5 r0 = X.AbstractC224579vi.A00(r1, r0, r5, r2)
            r8.A0A = r0
            X.Aa5 r0 = r8.A00()
            X.7yi r0 = X.C23432Aa5.A00(r0)
            r0.Egx(r7)
            X.Aa5 r0 = r8.A00()
            X.7yi r0 = X.C23432Aa5.A00(r0)
            r0.Eal(r6)
            X.Aa5 r0 = r8.A00()
            r1 = 921600(0xe1000, float:1.291437E-39)
            X.7yi r0 = X.C23432Aa5.A00(r0)
            r0.EbP(r1)
            X.Aa5 r0 = r8.A00()
            r1 = 0
            X.7yi r0 = X.C23432Aa5.A00(r0)
            r0.Eam(r1)
            r8.A00()
            X.Aa5 r0 = r8.A00()
            r1 = 1
            X.7yi r0 = X.C23432Aa5.A00(r0)
            r0.EaF(r1)
            if (r4 == 0) goto Lbe
            r0 = 290(0x122, float:4.06E-43)
            java.lang.String r2 = X.AbstractC58317Pt9.A00(r0)
            boolean r0 = r4.containsKey(r2)
            if (r0 == 0) goto Lbe
            X.Aa5 r1 = r8.A00()
            int r0 = r4.getInt(r2)
            r1.A03(r0)
        Lbe:
            r0 = -2084034932(0xffffffff83c8268c, float:-1.1763793E-36)
            X.C0f9.A09(r0, r3)
            return
        Lc5:
            r5 = 0
            if (r4 == 0) goto L52
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C210719Tt.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(353358398);
        C14360o3.A0B(layoutInflater, 0);
        C23432Aa5 A00 = A00();
        layoutInflater.getContext();
        this.A03 = A00.A01();
        Context context = layoutInflater.getContext();
        C14360o3.A07(context);
        View view = this.A03;
        if (view == null) {
            C14360o3.A0F("cameraView");
            throw C00O.createAndThrow();
        }
        C9TT c9tt = new C9TT(context, view);
        this.A04 = c9tt;
        C0f9.A09(-171581856, A02);
        return c9tt;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1883523376);
        A00().destroy();
        super.onDestroy();
        C0f9.A09(-80440167, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(155202147);
        A00().pause();
        A00().A05(this);
        super.onPause();
        C0f9.A09(-1192464501, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1197845324);
        super.onResume();
        A00().A04(this);
        A00().EKd();
        C0f9.A09(-1263619329, A02);
    }
}

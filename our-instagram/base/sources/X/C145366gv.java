package X;

import android.content.Intent;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.6gv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145366gv implements InterfaceC145376gw {
    public UserSession A00;
    public C145826hf A01;
    public C147956lR A02;
    public final InterfaceC60442pS A03;
    public final InterfaceC1118853a A04;
    public final InterfaceC144586fe A05;
    public final WeakReference A06;

    @Override // X.InterfaceC144626fi, X.InterfaceC144636fj
    public final boolean Drb(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C14360o3.A0B(motionEvent, 0);
        C14360o3.A0B(motionEvent2, 1);
        return this.A05.Drb(motionEvent, motionEvent2, f, f2);
    }

    @Override // X.InterfaceC145376gw
    public final void Dxh(C41181vS c41181vS, C41551w4 c41551w4, Integer num) {
        C14360o3.A0B(num, 2);
        this.A05.Dxh(c41181vS, c41551w4, num);
    }

    @Override // X.InterfaceC145376gw
    public final void DJd() {
        FragmentActivity activity;
        Fragment fragment = (Fragment) this.A06.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            Intent A03 = C14H.A03.A00().A03(activity, 268533760);
            A03.setData(AbstractC08820cl.A03("instagram://story-camera").buildUpon().appendQueryParameter(DatePickerDialogModule.ARG_MODE, EnumC223209sz.A0A.toString()).build());
            UserSession userSession = this.A00;
            if (userSession == null) {
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
            C55772hI.A00(userSession).A0C(this.A03, "live_end_screen_pivot", fragment.getParentFragmentManager().A0L());
            C12260kU.A0C(activity, A03);
        }
    }

    @Override // X.InterfaceC145376gw
    public final void DPL() {
        this.A04.CqT();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r0.A00 != r4.A1C.CNP(r8.A0H)) goto L10;
     */
    @Override // X.InterfaceC145376gw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DPT(X.C41181vS r7, X.C41551w4 r8, X.C138376Ot r9, boolean r10) {
        /*
            r6 = this;
            X.53a r5 = r6.A04
            r4 = r5
            instagram.features.stories.fragment.ReelViewerFragment r4 = (instagram.features.stories.fragment.ReelViewerFragment) r4
            X.1w4 r3 = r4.A0a
            if (r3 != r8) goto L23
            X.6lR r0 = r6.A02
            if (r0 != 0) goto L17
            java.lang.String r0 = "reelChromeAnimationManager"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L17:
            int r2 = r0.A00
            com.instagram.model.reels.Reel r1 = r8.A0H
            X.5Gn r0 = r4.A1C
            int r0 = r0.CNP(r1)
            if (r2 == r0) goto L28
        L23:
            r0 = 1065353216(0x3f800000, float:1.0)
            r9.ERN(r0)
        L28:
            if (r3 == r8) goto L2c
            if (r10 == 0) goto L2f
        L2c:
            r5.D8u(r7, r9)
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145366gv.DPT(X.1vS, X.1w4, X.6Ot, boolean):void");
    }

    @Override // X.InterfaceC145376gw
    public final void DPU(C41181vS c41181vS, C41551w4 c41551w4, boolean z) {
        C145826hf c145826hf = this.A01;
        if (c145826hf == null) {
            C14360o3.A0F("reelViewerLogger");
            throw C00O.createAndThrow();
        }
        if (z) {
            c145826hf.A09(c41181vS, c41551w4);
        }
    }

    @Override // X.InterfaceC144626fi, X.InterfaceC144636fj
    public final boolean DrS(float f, float f2) {
        return this.A05.DrS(f, f2);
    }

    @Override // X.InterfaceC144626fi
    public final boolean DrU() {
        return this.A05.DrU();
    }

    @Override // X.InterfaceC144626fi
    public final boolean DrW() {
        return this.A05.DrW();
    }

    @Override // X.InterfaceC145376gw
    public final void DsB(float f, float f2) {
        this.A05.DsB(f, f2);
    }

    @Override // X.InterfaceC145376gw
    public final void DzH(boolean z) {
        C138376Ot c138376Ot;
        InterfaceC143576dw Av7 = this.A04.Av7();
        if ((Av7 instanceof C138376Ot) && (c138376Ot = (C138376Ot) Av7) != null) {
            UserSession userSession = this.A00;
            if (z) {
                if (userSession != null) {
                    AbstractC50547MTc.A02(c138376Ot);
                    return;
                }
            } else if (userSession != null) {
                c138376Ot.A01();
                c138376Ot.A03(true);
                return;
            }
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
    }

    public C145366gv(InterfaceC60442pS interfaceC60442pS, InterfaceC1118853a interfaceC1118853a, InterfaceC144586fe interfaceC144586fe, WeakReference weakReference) {
        this.A06 = weakReference;
        this.A05 = interfaceC144586fe;
        this.A04 = interfaceC1118853a;
        this.A03 = interfaceC60442pS;
    }
}

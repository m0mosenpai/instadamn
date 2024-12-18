package X;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.smartcapture.docauth.DocAuthManager;

/* loaded from: classes12.dex */
public final class XQ2 extends Fragment implements InterfaceC65581TnK, InterfaceC25160BBf {
    public static final /* synthetic */ C0YR[] A06 = {new AnonymousClass013(XQ2.class, "camDelegate", "getCamDelegate()Lcom/facebook/smartcapture/camera/CameraDelegate;", 0), new AnonymousClass013(XQ2.class, "initListener", "getInitListener()Lcom/facebook/optic/previewview/CameraPreviewView$OnInitialisedListener;", 0)};
    public long A00;
    public C177447ue A01;
    public C9TO A02;
    public final InterfaceC16530ry A04 = new YJN(0);
    public final InterfaceC16530ry A05 = new YJN(0);
    public boolean A03 = true;

    @Override // X.InterfaceC25160BBf
    public final void Dad(C196708n0 c196708n0) {
        byte[] bArr;
        C14360o3.A0B(c196708n0, 0);
        DocAuthManager docAuthManager = (DocAuthManager) AbstractC31171DnF.A0Y(this, this.A04, A06, 0);
        if (docAuthManager != null && (bArr = c196708n0.A09) != null) {
            docAuthManager.onPreviewFrame(bArr);
        }
    }

    @Override // X.InterfaceC65581TnK
    public final boolean Ept(InterfaceC196578mn interfaceC196578mn) {
        C9TO c9to = this.A02;
        if (c9to != null) {
            if (!c9to.A0U.isConnected()) {
                if (SystemClock.elapsedRealtime() - this.A00 > LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) {
                    interfaceC196578mn.DEF(AbstractC166987dD.A14("Camera is disconnected."));
                    return true;
                }
                return true;
            }
            C176807tc c176807tc = AbstractC176797tb.A0B;
            C14360o3.A08(c176807tc);
            Number number = (Number) A00(c176807tc, this);
            if (number != null && number.intValue() == 0) {
                C9TO c9to2 = this.A02;
                if (c9to2 != null) {
                    c9to2.A04(interfaceC196578mn);
                    return true;
                }
            } else {
                C176837tf c176837tf = new C176837tf();
                c176837tf.A01(c176807tc, 0);
                C9TO c9to3 = this.A02;
                if (c9to3 != null) {
                    c9to3.A0U.Cpo(new XW1(1, this, interfaceC196578mn), c176837tf.A00());
                    return true;
                }
            }
        }
        C14360o3.A0F("cameraPreview");
        throw C00O.createAndThrow();
    }

    public static final Object A00(C176807tc c176807tc, XQ2 xq2) {
        Object A02;
        C177447ue c177447ue = xq2.A01;
        if (c177447ue == null || (A02 = c177447ue.A03.A02(c176807tc)) == null) {
            C9TO c9to = xq2.A02;
            if (c9to == null) {
                C14360o3.A0F("cameraPreview");
                throw C00O.createAndThrow();
            }
            return c9to.A0U.Bty().A02(c176807tc);
        }
        return A02;
    }

    @Override // X.InterfaceC65581TnK
    public final C176877tj Bd7() {
        C176807tc c176807tc = AbstractC176797tb.A0k;
        C14360o3.A08(c176807tc);
        return (C176877tj) A00(c176807tc, this);
    }

    @Override // X.InterfaceC65581TnK
    public final C176877tj Bfw() {
        C176807tc c176807tc = AbstractC176797tb.A0q;
        C14360o3.A08(c176807tc);
        return (C176877tj) A00(c176807tc, this);
    }

    @Override // X.InterfaceC65581TnK
    public final int Bpd(int i) {
        C9TO c9to = this.A02;
        if (c9to == null) {
            C14360o3.A0F("cameraPreview");
            throw C00O.createAndThrow();
        }
        InterfaceC175067qg interfaceC175067qg = c9to.A0U;
        return interfaceC175067qg.AFE(interfaceC175067qg.Ak0(), i);
    }

    @Override // X.InterfaceC65581TnK
    public final void EQo(DocAuthManager docAuthManager) {
        this.A04.Egi(this, docAuthManager, A06[0]);
    }

    @Override // X.InterfaceC65581TnK
    public final void EQu(int i) {
        C9TO c9to = this.A02;
        if (c9to == null) {
            C14360o3.A0F("cameraPreview");
            throw C00O.createAndThrow();
        }
        c9to.post(new YHF(this, i));
    }

    @Override // X.InterfaceC65581TnK
    public final void EZw(InterfaceC1814282u interfaceC1814282u) {
        this.A05.Egi(this, interfaceC1814282u, A06[1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.7px] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            android.os.Bundle r5 = r6.mArguments
            r3 = 0
            java.lang.String r4 = "cameraPreview"
            if (r5 == 0) goto L18
            r0 = 290(0x122, float:4.06E-43)
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            int r1 = r5.getInt(r0, r3)
            X.9TO r0 = r6.A02
            if (r0 == 0) goto L6f
            r0.setInitialCameraFacing(r1)
        L18:
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            java.lang.String r1 = "fixed_photo_size"
            if (r2 < r0) goto L61
            if (r5 == 0) goto L68
            java.lang.Class<com.facebook.smartcapture.camera.sizesetter.FixedSizes> r0 = com.facebook.smartcapture.camera.sizesetter.FixedSizes.class
            java.lang.Object r0 = r5.getParcelable(r1, r0)
        L28:
            com.facebook.smartcapture.camera.sizesetter.FixedSizes r0 = (com.facebook.smartcapture.camera.sizesetter.FixedSizes) r0
            if (r0 == 0) goto L68
            X.SzA r2 = new X.SzA
            r2.<init>(r0)
            boolean r0 = r0.A02
        L33:
            r6.A03 = r0
            X.9TO r1 = r6.A02
            if (r1 == 0) goto L6f
            r1.A0C = r3
            X.7q0 r0 = X.EnumC174667q0.HIGH
            r1.A03 = r0
            X.7q0 r0 = X.EnumC174667q0.DEACTIVATED
            r1.A04 = r0
            r1.A05 = r2
            X.YBp r0 = new X.YBp
            r0.<init>(r6, r3)
            r1.setOnInitialisedListener(r0)
            X.9TO r0 = r6.A02
            if (r0 == 0) goto L6f
            r0.setDoubleTapToZoomEnabled(r3)
            X.9TO r0 = r6.A02
            if (r0 == 0) goto L6f
            r0.A0E = r3
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.A00 = r0
            return
        L61:
            if (r5 == 0) goto L68
            android.os.Parcelable r0 = r5.getParcelable(r1)
            goto L28
        L68:
            X.Sz9 r2 = new X.Sz9
            r2.<init>()
            r0 = 1
            goto L33
        L6f:
            X.C14360o3.A0F(r4)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XQ2.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-143001755);
        C9TO c9to = new C9TO(requireActivity());
        this.A02 = c9to;
        C0f9.A09(46410130, A02);
        return c9to;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(441977787);
        super.onPause();
        C9TO c9to = this.A02;
        if (c9to == null) {
            C14360o3.A0F("cameraPreview");
            throw C00O.createAndThrow();
        }
        c9to.A03();
        C0f9.A09(912779833, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1943562222);
        super.onResume();
        C9TO c9to = this.A02;
        if (c9to == null) {
            C14360o3.A0F("cameraPreview");
            throw C00O.createAndThrow();
        }
        c9to.A0D = false;
        if (c9to.isAvailable()) {
            C9TO.A02(c9to);
        }
        C0f9.A09(-688920572, A02);
    }
}

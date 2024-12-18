package X;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.smartcapture.camera.DialogTexts;
import com.facebook.smartcapture.camera.sizesetter.FixedSizes;
import com.facebook.smartcapture.docauth.DocAuthManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public final class XQ3 extends Fragment implements InterfaceC65581TnK, InterfaceC25160BBf {
    public long A00;
    public C177447ue A01;
    public C9TO A02;
    public boolean A03;
    public boolean A04;
    public static final /* synthetic */ C0YR[] A0B = {new AnonymousClass013(XQ3.class, "camDelegate", "getCamDelegate()Lcom/facebook/smartcapture/camera/CameraDelegate;", 0), new AnonymousClass013(XQ3.class, "initListener", "getInitListener()Lcom/facebook/optic/previewview/CameraPreviewView$OnInitialisedListener;", 0)};
    public static final AtomicBoolean A0A = new AtomicBoolean(true);
    public final InterfaceC16530ry A08 = new YJN(1);
    public final InterfaceC16530ry A09 = new YJN(1);
    public boolean A05 = true;
    public DialogTexts A06 = new DialogTexts("", "", "", "", "", "", "", "");
    public final C00X A07 = registerForActivityResult(new Object(), new C63538Sp6(this, 2));

    @Override // X.InterfaceC25160BBf
    public final void Dad(C196708n0 c196708n0) {
        byte[] bArr;
        C14360o3.A0B(c196708n0, 0);
        DocAuthManager docAuthManager = (DocAuthManager) AbstractC31171DnF.A0Y(this, this.A08, A0B, 0);
        if (docAuthManager != null && (bArr = c196708n0.A09) != null) {
            docAuthManager.onPreviewFrame(bArr);
        }
    }

    @Override // X.InterfaceC65581TnK
    public final boolean Ept(InterfaceC196578mn interfaceC196578mn) {
        if (A02(this)) {
            return false;
        }
        C9TO c9to = this.A02;
        if (c9to != null) {
            if (!c9to.A0U.isConnected()) {
                if (SystemClock.elapsedRealtime() - this.A00 > LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) {
                    interfaceC196578mn.DEF(AbstractC166987dD.A14("Camera is disconnected."));
                    return false;
                }
                return false;
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
                    c9to3.A0U.Cpo(new XW1(2, this, interfaceC196578mn), c176837tf.A00());
                    return true;
                }
            }
        }
        C14360o3.A0F("cameraPreview");
        throw C00O.createAndThrow();
    }

    public static final Object A00(C176807tc c176807tc, XQ3 xq3) {
        Object A02;
        C177447ue c177447ue = xq3.A01;
        if (c177447ue == null || (A02 = c177447ue.A03.A02(c176807tc)) == null) {
            C9TO c9to = xq3.A02;
            if (c9to == null) {
                C14360o3.A0F("cameraPreview");
                throw C00O.createAndThrow();
            }
            return c9to.A0U.Bty().A02(c176807tc);
        }
        return A02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.7px] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public static final boolean A02(XQ3 xq3) {
        FixedSizes fixedSizes;
        Object parcelable;
        boolean z;
        ?? r1;
        Bundle bundle = xq3.mArguments;
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                fixedSizes = (FixedSizes) bundle.getParcelable("fixed_photo_size", FixedSizes.class);
                parcelable = bundle.getParcelable("texts", DialogTexts.class);
            } else {
                fixedSizes = (FixedSizes) bundle.getParcelable("fixed_photo_size");
                parcelable = bundle.getParcelable("texts");
            }
            DialogTexts dialogTexts = (DialogTexts) parcelable;
            if (dialogTexts == null) {
                dialogTexts = xq3.A06;
            }
            xq3.A06 = dialogTexts;
            if (fixedSizes != null) {
                C64093SzA c64093SzA = new C64093SzA(fixedSizes);
                z = fixedSizes.A02;
                r1 = c64093SzA;
            } else {
                z = true;
                r1 = new Object();
            }
            xq3.A05 = z;
            C9TO c9to = xq3.A02;
            if (c9to != null) {
                c9to.A05 = r1;
            }
            C14360o3.A0F("cameraPreview");
            throw C00O.createAndThrow();
        }
        if (!A01(xq3)) {
            return true;
        }
        if (xq3.A00 <= 0) {
            C9TO c9to2 = xq3.A02;
            if (c9to2 != null) {
                c9to2.setInitialCameraFacing(0);
                C9TO c9to3 = xq3.A02;
                if (c9to3 != null) {
                    c9to3.A0C = false;
                    c9to3.A03 = EnumC174667q0.HIGH;
                    c9to3.A04 = EnumC174667q0.DEACTIVATED;
                    c9to3.setOnInitialisedListener(new C73403YBp(xq3, 1));
                    C9TO c9to4 = xq3.A02;
                    if (c9to4 != null) {
                        c9to4.setDoubleTapToZoomEnabled(false);
                        C9TO c9to5 = xq3.A02;
                        if (c9to5 != null) {
                            c9to5.A0E = false;
                            xq3.A00 = SystemClock.elapsedRealtime();
                        }
                    }
                }
            }
            C14360o3.A0F("cameraPreview");
            throw C00O.createAndThrow();
        }
        return false;
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
        this.A08.Egi(this, docAuthManager, A0B[0]);
    }

    @Override // X.InterfaceC65581TnK
    public final void EQu(int i) {
        if (this.A00 != 0) {
            C9TO c9to = this.A02;
            if (c9to == null) {
                C14360o3.A0F("cameraPreview");
                throw C00O.createAndThrow();
            }
            c9to.post(new YHG(this, i));
        }
    }

    @Override // X.InterfaceC65581TnK
    public final void EZw(InterfaceC1814282u interfaceC1814282u) {
        this.A09.Egi(this, interfaceC1814282u, A0B[1]);
    }

    public static final boolean A01(XQ3 xq3) {
        AlertDialog.Builder negativeButton;
        DialogInterfaceOnDismissListenerC63426Sk5 dialogInterfaceOnDismissListenerC63426Sk5;
        Context requireContext = xq3.requireContext();
        String A00 = AbstractC43591JPw.A00(65);
        if (C02G.A00(requireContext, A00) == 0) {
            return true;
        }
        if (!xq3.A03) {
            if (!A0A.compareAndSet(true, false)) {
                if (xq3.shouldShowRequestPermissionRationale(A00)) {
                    negativeButton = new AlertDialog.Builder(xq3.requireContext()).setTitle(xq3.A06.A03).setMessage(xq3.A06.A02).setPositiveButton(xq3.A06.A01, new DialogInterfaceOnClickListenerC63420Sjy(xq3, 3)).setNegativeButton(xq3.A06.A00, (DialogInterface.OnClickListener) null);
                    dialogInterfaceOnDismissListenerC63426Sk5 = new DialogInterfaceOnDismissListenerC63426Sk5(xq3, 1);
                } else if (xq3.A04) {
                    negativeButton = new AlertDialog.Builder(xq3.requireContext()).setTitle(xq3.A06.A07).setMessage(xq3.A06.A06).setPositiveButton(xq3.A06.A05, new DialogInterfaceOnClickListenerC63420Sjy(xq3, 4)).setNegativeButton(xq3.A06.A04, (DialogInterface.OnClickListener) null);
                    dialogInterfaceOnDismissListenerC63426Sk5 = new DialogInterfaceOnDismissListenerC63426Sk5(xq3, 2);
                }
                C0fJ.A00(negativeButton.setOnDismissListener(dialogInterfaceOnDismissListenerC63426Sk5).create());
                xq3.A03 = true;
            }
            xq3.A07.A02(A00);
            return false;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1629385730);
        C9TO c9to = new C9TO(requireActivity());
        this.A02 = c9to;
        C0f9.A09(439777174, A02);
        return c9to;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int i;
        int A02 = C0f9.A02(-1779128419);
        super.onPause();
        if (this.A00 == 0) {
            i = -1611750824;
        } else {
            C9TO c9to = this.A02;
            if (c9to == null) {
                C14360o3.A0F("cameraPreview");
                throw C00O.createAndThrow();
            }
            c9to.A03();
            i = 198263183;
        }
        C0f9.A09(i, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1984178723);
        super.onResume();
        A02(this);
        C9TO c9to = this.A02;
        if (c9to == null) {
            C14360o3.A0F("cameraPreview");
            throw C00O.createAndThrow();
        }
        c9to.A0D = false;
        if (c9to.isAvailable()) {
            C9TO.A02(c9to);
        }
        C0f9.A09(629408800, A02);
    }
}

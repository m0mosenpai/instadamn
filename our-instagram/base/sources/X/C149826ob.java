package X;

import android.widget.TextView;
import com.facebook.cameracore.audiograph.AudioGraphClientProvider;
import com.facebook.cameracore.mediapipeline.services.cameracontrol.CameraControlServiceDelegate;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource;
import com.facebook.cameracore.musiceffect.AudioServiceConfigurationAnnouncer;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6ob, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149826ob implements InterfaceC149836oc {
    public static final String __redex_internal_original_name = "IgCameraEffectManagerWrapper";
    public TextView A00;
    public GalleryPickerServiceDataSource A01;
    public InterfaceC142616cN A02;
    public volatile InterfaceC149836oc A07;
    public final List A06 = new ArrayList();
    public final List A05 = new ArrayList();
    public final Object A04 = new Object();
    public C142626cO A03 = new C142626cO(this);

    @Override // X.InterfaceC149836oc
    public final C177797vD AMy(C203678zW c203678zW, AudioGraphClientProvider audioGraphClientProvider, C1814883b c1814883b, InterfaceC1815083d interfaceC1815083d, C200478tq c200478tq, EnumC150616qF enumC150616qF, CameraControlServiceDelegate cameraControlServiceDelegate, InterfaceC149876og interfaceC149876og, C83W c83w, C83Y c83y, C8zr c8zr, AudioServiceConfigurationAnnouncer audioServiceConfigurationAnnouncer, C83P c83p, CameraAREffect cameraAREffect, UserSession userSession, Integer num, Integer num2, String str, String str2, boolean z) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c83w, 3);
        C14360o3.A0B(c83y, 5);
        C14360o3.A0B(num, 7);
        C14360o3.A0B(num2, 8);
        C14360o3.A0B(enumC150616qF, 10);
        C14360o3.A0B(str2, 12);
        if (this.A07 == null) {
            if (cameraAREffect != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("removeEffect() but mDelegate is null, effect is");
                sb.append(cameraAREffect);
                AbstractC12120kG.A07(__redex_internal_original_name, sb.toString(), null);
            }
        } else {
            InterfaceC149836oc interfaceC149836oc = this.A07;
            if (interfaceC149836oc != null) {
                return interfaceC149836oc.AMy(c203678zW, audioGraphClientProvider, c1814883b, interfaceC1815083d, c200478tq, enumC150616qF, cameraControlServiceDelegate, interfaceC149876og, c83w, c83y, c8zr, audioServiceConfigurationAnnouncer, c83p, cameraAREffect, userSession, num, num2, str, str2, z);
            }
        }
        return null;
    }

    @Override // X.InterfaceC149836oc
    public final C177797vD ANP(String str) {
        C14360o3.A0B(str, 0);
        InterfaceC149836oc interfaceC149836oc = this.A07;
        if (interfaceC149836oc != null) {
            return interfaceC149836oc.ANP(str);
        }
        return null;
    }

    @Override // X.InterfaceC149836oc
    public final void Cki(String str) {
        C14360o3.A0B(str, 0);
        InterfaceC149836oc interfaceC149836oc = this.A07;
        if (interfaceC149836oc != null) {
            interfaceC149836oc.Cki(str);
        }
    }

    @Override // X.InterfaceC149836oc
    public final void EoY(String str) {
        C14360o3.A0B(str, 0);
        InterfaceC149836oc interfaceC149836oc = this.A07;
        if (interfaceC149836oc != null) {
            interfaceC149836oc.EoY(str);
        }
    }

    @Override // X.InterfaceC149836oc
    public final void A8Z(InterfaceC142616cN interfaceC142616cN) {
        this.A02 = interfaceC142616cN;
        InterfaceC149836oc interfaceC149836oc = this.A07;
        if (interfaceC149836oc != null) {
            interfaceC149836oc.A8Z(interfaceC142616cN);
        }
    }

    @Override // X.InterfaceC149836oc
    public final C142626cO B0c() {
        return this.A03;
    }

    @Override // X.InterfaceC149836oc
    public final boolean CLs(CameraAREffect cameraAREffect) {
        InterfaceC149836oc interfaceC149836oc = this.A07;
        if (interfaceC149836oc != null) {
            return interfaceC149836oc.CLs(cameraAREffect);
        }
        return false;
    }

    @Override // X.InterfaceC149836oc
    public final boolean CSw(CameraAREffect cameraAREffect) {
        InterfaceC149836oc interfaceC149836oc = this.A07;
        if (interfaceC149836oc != null) {
            return interfaceC149836oc.CSw(cameraAREffect);
        }
        return false;
    }

    @Override // X.InterfaceC149836oc
    public final InterfaceC150176pN ChO(C203708zZ c203708zZ, C1819185b c1819185b, CameraAREffect cameraAREffect, InterfaceC203668zV interfaceC203668zV) {
        InterfaceC149836oc interfaceC149836oc = this.A07;
        if (interfaceC149836oc != null) {
            return interfaceC149836oc.ChO(c203708zZ, c1819185b, cameraAREffect, interfaceC203668zV);
        }
        return null;
    }

    @Override // X.InterfaceC149836oc
    public final void Cln(C203678zW c203678zW, C1819185b c1819185b, CameraAREffect cameraAREffect) {
        InterfaceC149836oc interfaceC149836oc = this.A07;
        if (interfaceC149836oc != null) {
            interfaceC149836oc.Cln(c203678zW, c1819185b, cameraAREffect);
        }
    }

    @Override // X.InterfaceC149836oc
    public final void E5F(String str, List list) {
        InterfaceC149836oc interfaceC149836oc = this.A07;
        if (interfaceC149836oc != null) {
            interfaceC149836oc.E5F(str, list);
        }
    }

    @Override // X.InterfaceC149836oc
    public final void EP3(TextView textView) {
        if (this.A07 == null) {
            synchronized (this.A04) {
                if (this.A07 == null) {
                    this.A00 = textView;
                    return;
                }
            }
        }
        InterfaceC149836oc interfaceC149836oc = this.A07;
        if (interfaceC149836oc != null) {
            interfaceC149836oc.EP3(textView);
        }
    }

    @Override // X.InterfaceC149836oc
    public final void EUu(GalleryPickerServiceDataSource galleryPickerServiceDataSource) {
        if (this.A07 == null) {
            synchronized (this.A04) {
                if (this.A07 == null) {
                    this.A01 = galleryPickerServiceDataSource;
                    return;
                }
            }
        }
        InterfaceC149836oc interfaceC149836oc = this.A07;
        if (interfaceC149836oc != null) {
            interfaceC149836oc.EUu(galleryPickerServiceDataSource);
        }
    }

    @Override // X.InterfaceC149836oc, X.InterfaceC11380iw
    public final String getModuleName() {
        if (this.A07 == null) {
            C0w9.A03(__redex_internal_original_name, "getModuleName() delegate is null");
            return "unknown_ig_composer";
        }
        InterfaceC149836oc interfaceC149836oc = this.A07;
        if (interfaceC149836oc != null) {
            return interfaceC149836oc.getModuleName();
        }
        return "";
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        if (this.A07 == null) {
            C0w9.A03(__redex_internal_original_name, "onUserSessionWillEnd() delegate is null");
            return;
        }
        InterfaceC149836oc interfaceC149836oc = this.A07;
        if (interfaceC149836oc == null) {
            return;
        }
        interfaceC149836oc.onUserSessionWillEnd(z);
    }

    public C149826ob(InterfaceC142616cN interfaceC142616cN) {
        this.A02 = interfaceC142616cN;
    }
}

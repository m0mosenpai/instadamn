package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.wonderwall.model.WallMenuConfig;
import com.instagram.wonderwall.repository.WallFeedRepository;
import go.Seq;

/* renamed from: X.Pg3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57529Pg3 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57529Pg3(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C57529Pg3 A00(Object obj, int i) {
        return new C57529Pg3(obj, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        InterfaceC74963Ym interfaceC74963Ym;
        Object obj;
        Bundle A04;
        String str;
        InterfaceC09390do interfaceC09390do;
        int i;
        Bundle bundle;
        String A00;
        boolean z;
        String str2;
        C146106i8 A0K;
        boolean z2;
        InterfaceC58152PqH p3i;
        switch (this.A00) {
            case 0:
                return new NCM(AbstractC54349O0h.A00, ((N7K) this.A01).A06);
            case 1:
                N7K n7k = ((C50886MeH) this.A01).A01.A00;
                Context context = n7k.getContext();
                if (context != null) {
                    Drawable drawable = context.getDrawable(R.drawable.instagram_circle_x_pano_outline_24);
                    if (drawable != null) {
                        drawable.setColorFilter(n7k.A05, PorterDuff.Mode.SRC_IN);
                    }
                    A0K = AbstractC31171DnF.A0K();
                    A0K.A06();
                    z2 = true;
                    A0K.A0D = AbstractC167007dF.A0f(context, n7k.A0B.getValue(), 2131976321);
                    A0K.A0I = context.getString(2131976320);
                    A0K.A04 = drawable;
                    A0K.A02();
                    AbstractC31175DnJ.A0l(context, A0K, 2131976327);
                    p3i = new P3G(n7k, 4);
                    A0K.A0A = p3i;
                    A0K.A0L = z2;
                    AbstractC25233BEq.A1F(A0K);
                }
                return C0eB.A00;
            case 2:
                N7K n7k2 = ((C50886MeH) this.A01).A01.A00;
                Context context2 = n7k2.getContext();
                if (context2 != null) {
                    Drawable drawable2 = context2.getDrawable(R.drawable.instagram_circle_x_pano_outline_24);
                    if (drawable2 != null) {
                        drawable2.setColorFilter(n7k2.A05, PorterDuff.Mode.SRC_IN);
                    }
                    A0K = AbstractC31171DnF.A0K();
                    A0K.A06();
                    z2 = true;
                    A0K.A0D = AbstractC167007dF.A0f(context2, n7k2.A0B.getValue(), 2131976329);
                    A0K.A0I = context2.getString(2131976328);
                    A0K.A04 = drawable2;
                    A0K.A02();
                    AbstractC31175DnJ.A0l(context2, A0K, 2131976327);
                    p3i = new P3I(4, context2, n7k2);
                    A0K.A0A = p3i;
                    A0K.A0L = z2;
                    AbstractC25233BEq.A1F(A0K);
                }
                return C0eB.A00;
            case 3:
                C9GR.A07(((C50886MeH) this.A01).A01.A00.getContext(), 2131972429);
                return C0eB.A00;
            case 4:
                interfaceC09390do = ((N4T) this.A01).A05;
                AbstractC53034Nd6 A0v = MSW.A0v(interfaceC09390do);
                PYu.A01(A0v, AbstractC167017dG.A0w((C12M) A0v.A03.getValue(), 49672377), 25);
                return C0eB.A00;
            case 5:
            case 9:
            case 14:
            case Process.SIGSTOP /* 19 */:
            case 26:
            case 31:
                return this.A01;
            case 6:
            case 10:
            case Process.SIGTERM /* 15 */:
            case 20:
            case 27:
            case 32:
                return AbstractC25226BEj.A1C(this.A01);
            case 7:
            case 11:
            case 16:
            case 21:
            case 28:
            case 33:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 8:
                N4T n4t = (N4T) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(n4t.A04);
                OWU owu = n4t.A00;
                if (owu != null) {
                    C54990OTy c54990OTy = n4t.A01;
                    if (c54990OTy != null) {
                        return new C52307NCw(A0r, owu, c54990OTy);
                    }
                    str2 = "snackBarLogger";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                str2 = "bottomSheetLogger";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                N4V n4v = (N4V) this.A01;
                UserSession A0r2 = AbstractC166987dD.A0r(n4v.A05);
                OWU owu2 = n4v.A00;
                if (owu2 != null) {
                    C54990OTy c54990OTy2 = n4v.A01;
                    if (c54990OTy2 != null) {
                        return new C52308NCx(A0r2, owu2, c54990OTy2);
                    }
                    str2 = "snackBarLogger";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                str2 = "bottomSheetLogger";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                interfaceC09390do = ((N4R) this.A01).A04;
                AbstractC53034Nd6 A0v2 = MSW.A0v(interfaceC09390do);
                PYu.A01(A0v2, AbstractC167017dG.A0w((C12M) A0v2.A03.getValue(), 49672377), 25);
                return C0eB.A00;
            case 17:
                N4R n4r = (N4R) this.A01;
                UserSession A0r3 = AbstractC166987dD.A0r(n4r.A03);
                OWU owu3 = n4r.A00;
                if (owu3 != null) {
                    return new NCN(A0r3, owu3);
                }
                str2 = "bottomSheetLogger";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 18:
                interfaceC09390do = ((N4U) this.A01).A05;
                AbstractC53034Nd6 A0v22 = MSW.A0v(interfaceC09390do);
                PYu.A01(A0v22, AbstractC167017dG.A0w((C12M) A0v22.A03.getValue(), 49672377), 25);
                return C0eB.A00;
            case 22:
                N4U n4u = (N4U) this.A01;
                UserSession A0r4 = AbstractC166987dD.A0r(n4u.A04);
                String str3 = n4u.A03;
                EnumC39589Hdz enumC39589Hdz = n4u.A00;
                OLM olm = n4u.A01;
                if (olm == null) {
                    str2 = "upsellsLogger";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                C54990OTy c54990OTy3 = n4u.A02;
                if (c54990OTy3 != null) {
                    return new C52315NDe(n4u, A0r4, enumC39589Hdz, olm, c54990OTy3, str3);
                }
                str2 = "snackBarLogger";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 23:
                bundle = ((Fragment) this.A01).mArguments;
                if (bundle != null) {
                    A00 = "key_is_launched_from_bottom_sheet";
                    z = bundle.getBoolean(A00);
                    return Boolean.valueOf(z);
                }
                z = false;
                return Boolean.valueOf(z);
            case 24:
                bundle = ((Fragment) this.A01).mArguments;
                if (bundle != null) {
                    A00 = AbstractC111324zv.A00(4804);
                    z = bundle.getBoolean(A00);
                    return Boolean.valueOf(z);
                }
                z = false;
                return Boolean.valueOf(z);
            case 25:
                Bundle bundle2 = ((Fragment) this.A01).mArguments;
                if (bundle2 != null) {
                    i = bundle2.getInt(AbstractC111324zv.A00(4805));
                } else {
                    i = 0;
                }
                return Integer.valueOf(i);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C52117N4p c52117N4p = (C52117N4p) this.A01;
                return new OLM(c52117N4p, AbstractC166987dD.A0r(c52117N4p.A04));
            case 30:
                interfaceC09390do = ((N4W) this.A01).A07;
                AbstractC53034Nd6 A0v222 = MSW.A0v(interfaceC09390do);
                PYu.A01(A0v222, AbstractC167017dG.A0w((C12M) A0v222.A03.getValue(), 49672377), 25);
                return C0eB.A00;
            case 34:
                N4W n4w = (N4W) this.A01;
                UserSession A0r5 = AbstractC166987dD.A0r(n4w.A06);
                OWU owu4 = n4w.A00;
                if (owu4 != null) {
                    C54990OTy c54990OTy4 = n4w.A01;
                    if (c54990OTy4 != null) {
                        return new C52309NCy(A0r5, owu4, c54990OTy4);
                    }
                    str2 = "snackBarLogger";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                str2 = "bottomSheetLogger";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 35:
                return AbstractC31179DnN.A04(this.A01).get("content_warning_type");
            case 36:
                A04 = AbstractC31179DnN.A04(this.A01);
                str = "is_launched_from_bottom_sheet";
                return Boolean.valueOf(AbstractC31172DnG.A1X(A04, str));
            case 37:
                return C023409i.A0A.A06(AbstractC31179DnN.A04(this.A01));
            case 38:
                return AbstractC31179DnN.A04(this.A01).get("warning_type");
            case 39:
                return AbstractC23021Ah.A00(((WallFeedRepository) this.A01).A03);
            case 40:
                Parcelable parcelable = AbstractC31179DnN.A04(this.A01).getParcelable("wall_menu_arg_menu_config");
                if (parcelable != null) {
                    return parcelable;
                }
                return new WallMenuConfig();
            case Seq.NULL_REFNUM /* 41 */:
                A04 = AbstractC31179DnN.A04(this.A01);
                str = "is_self_nux";
                return Boolean.valueOf(AbstractC31172DnG.A1X(A04, str));
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                AbstractC167017dG.A0y(AbstractC31172DnG.A0C(this.A01), C3DN.A00);
                return C0eB.A00;
            case 43:
                C25868BcP c25868BcP = (C25868BcP) this.A01;
                c25868BcP.A00 = null;
                c25868BcP.A02(true);
                c25868BcP.A03.A06.Egh(null);
                return C0eB.A00;
            case 44:
                return ((C55059OaE) this.A01).A00.getValue();
            case 45:
                obj = ((C51752Mtb) this.A01).A02;
                AbstractC166987dD.A1Y(obj);
                return C0eB.A00;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return Boolean.valueOf(AbstractC167007dF.A1O(((C26019Bf8) this.A01).A00.A01.A00.length()));
            case 47:
                obj = this.A01;
                AbstractC166987dD.A1Y(obj);
                return C0eB.A00;
            case 48:
                interfaceC74963Ym = ((C27955CTv) this.A01).A00;
                return interfaceC74963Ym.getValue();
            case 49:
                interfaceC74963Ym = (InterfaceC74963Ym) this.A01;
                return interfaceC74963Ym.getValue();
        }
    }
}

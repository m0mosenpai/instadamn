package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.EIg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC32247EIg extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "AvatarStickerUpsellBottomSheetFragment";
    public Resources A01;
    public View A02;
    public TextView A03;
    public TextView A04;
    public IgImageView A05;
    public InterfaceC56392iX A06;
    public IgdsButton A07;
    public SpinnerImageView A08;
    public final int A0C = R.drawable.ig_avatar_assets_avatar_class_photo;
    public final InterfaceC09390do A0D = AbstractC09440dt.A00(EnumC09460dv.A02, C37048GUe.A00(this, 5));
    public int A0B = 2131953564;
    public int A0A = 2131953563;
    public int A09 = 2131953562;
    public int A00 = R.drawable.ig_avatar_assets_avatar_class_photo;
    public final InterfaceC09390do A0E = AbstractC60492pY.A02(this);

    public Integer A0C() {
        return null;
    }

    public Integer A0D() {
        return null;
    }

    public Integer A0E() {
        return null;
    }

    public Integer A0F() {
        return null;
    }

    public void A0I() {
    }

    public boolean A0K() {
        return false;
    }

    public boolean A0M() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0072  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC32247EIg.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final int A02() {
        if (this instanceof EEE) {
            return ((EEE) this).A00;
        }
        if (this instanceof EEG) {
            return ((EEG) this).A03;
        }
        if (this instanceof EEF) {
            return ((EEF) this).A03;
        }
        return this.A00;
    }

    public final IgImageView A03() {
        IgImageView igImageView = this.A05;
        if (igImageView != null) {
            return igImageView;
        }
        C14360o3.A0F("upsellImage");
        throw C00O.createAndThrow();
    }

    public int A04() {
        if (this instanceof EEG) {
            return ((EEG) this).A00;
        }
        return this.A09;
    }

    public int A05() {
        if (this instanceof EEG) {
            return ((EEG) this).A01;
        }
        return this.A0A;
    }

    public int A06() {
        if (this instanceof EEG) {
            return ((EEG) this).A02;
        }
        return this.A0B;
    }

    public int A07() {
        if (this instanceof EEE) {
            return 2131953502;
        }
        if (this instanceof EED) {
            return 2131953556;
        }
        if (this instanceof EEG) {
            return 2131971533;
        }
        if (this instanceof EEC) {
            return 2131953517;
        }
        return ((EEF) this).A00;
    }

    public int A08() {
        if (this instanceof EEE) {
            return 2131953503;
        }
        if (this instanceof EED) {
            return 2131953558;
        }
        if (this instanceof EEG) {
            return 2131971534;
        }
        if (this instanceof EEC) {
            return 2131953518;
        }
        return ((EEF) this).A01;
    }

    public int A09() {
        if (this instanceof EEE) {
            return 2131953504;
        }
        if (this instanceof EED) {
            return 2131953560;
        }
        if (this instanceof EEG) {
            return 2131971535;
        }
        if (this instanceof EEC) {
            return 2131953519;
        }
        return ((EEF) this).A02;
    }

    public C53O A0A() {
        if (this instanceof EEE) {
            return ((EEE) this).A01;
        }
        if (this instanceof EED) {
            return ((EED) this).A00;
        }
        if (this instanceof EEG) {
            return ((EEG) this).A04;
        }
        if (this instanceof EEC) {
            return ((EEC) this).A00;
        }
        return ((EEF) this).A05;
    }

    public ImageUrl A0B() {
        if (!(this instanceof EEE) && !(this instanceof EED) && (this instanceof EEG)) {
            return ((EEG) this).A05;
        }
        return null;
    }

    public String A0G() {
        String str;
        if (this instanceof EEE) {
            str = ((EEE) this).A03;
        } else if (this instanceof EED) {
            str = ((EED) this).A01;
        } else if (this instanceof EEG) {
            str = ((EEG) this).A06;
        } else if (this instanceof EEC) {
            str = ((EEC) this).A01;
        } else {
            str = ((EEF) this).A07;
        }
        if (str != null) {
            return str;
        }
        C14360o3.A0F("editorLoggingMechanism");
        throw C00O.createAndThrow();
    }

    public String A0H() {
        String str;
        if (this instanceof EEE) {
            str = ((EEE) this).A04;
        } else if (this instanceof EED) {
            str = ((EED) this).A02;
        } else if (this instanceof EEG) {
            str = ((EEG) this).A07;
        } else if (this instanceof EEC) {
            str = ((EEC) this).A02;
        } else {
            str = ((EEF) this).A08;
        }
        if (str != null) {
            return str;
        }
        C14360o3.A0F("editorLoggingSurface");
        throw C00O.createAndThrow();
    }

    public boolean A0J() {
        if (!(this instanceof EEE) && !(this instanceof EED) && (this instanceof EEG)) {
            return ((EEG) this).A09;
        }
        return false;
    }

    public boolean A0L() {
        if (this instanceof EEG) {
            return true;
        }
        if (this instanceof EEF) {
            return ((EEF) this).A09;
        }
        return false;
    }

    public void A0O() {
        AbstractC31181DnP.A0p(this, AbstractC47193KtS.A01);
    }

    public void A0P() {
        AbstractC31181DnP.A0p(this, AbstractC47193KtS.A01);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0E);
    }

    public void A0N() {
        ImageUrl A0B = A0B();
        if (A0B != null) {
            A03().setUrl(A0B, this);
        } else {
            AbstractC166997dE.A19(requireContext(), A03(), A02());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(108591137);
        super.onCreate(bundle);
        requireArguments();
        C0f9.A09(-785185396, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1928022888);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.avatar_sticker_upsell_sheet_fragment, viewGroup, false);
        C0f9.A09(72019535, A02);
        return inflate;
    }
}

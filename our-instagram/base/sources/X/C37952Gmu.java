package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.AdFormatType;
import com.instagram.api.schemas.IGAdsIABScreenshotDataDict;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.reels.Reel;
import com.instagram.sponsored.analytics.SourceModelInfoParams;

/* renamed from: X.Gmu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37952Gmu {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public DialogInterface.OnDismissListener A0E;
    public InterfaceC104784ni A0F;
    public IGAdsIABScreenshotDataDict A0G;
    public IntentAwareAdsInfoIntf A0H;
    public C11520jB A0I;
    public C38321qM A0J;
    public C75113Zb A0K;
    public AndroidLink A0L;
    public Reel A0M;
    public C41551w4 A0N;
    public C40971v4 A0O;
    public InterfaceC1118853a A0P;
    public C51D A0Q;
    public InterfaceC65577TnB A0R;
    public InterfaceC86363t8 A0S;
    public SPM A0T;
    public W4O A0U;
    public C69257VkQ A0V;
    public C145726hV A0W;
    public Integer A0X;
    public Integer A0Y;
    public Integer A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public int[] A0x;
    public int[] A0y;
    public final Fragment A0z;
    public final FragmentActivity A10;
    public final UserSession A11;
    public final C5H9 A12;
    public final InterfaceC60442pS A13;
    public final C2Fb A14;
    public final InterfaceC09390do A15;

    public C37952Gmu(Fragment fragment, UserSession userSession, C5H9 c5h9, InterfaceC60442pS interfaceC60442pS, C2Fb c2Fb) {
        C14360o3.A0B(userSession, 1);
        AbstractC25233BEq.A0w(2, fragment, c2Fb, interfaceC60442pS);
        this.A11 = userSession;
        this.A0z = fragment;
        this.A14 = c2Fb;
        this.A13 = interfaceC60442pS;
        this.A12 = c5h9;
        this.A15 = J8V.A00(this, 23);
        this.A10 = fragment.requireActivity();
        this.A09 = -1;
        this.A03 = 0.5f;
        this.A08 = 2;
        this.A0s = true;
    }

    public final void A00(IgImageView igImageView, C5SE c5se, C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        if (c38321qM.A5Q() && igImageView != null) {
            int[] iArr = new int[2];
            igImageView.getLocationInWindow(iArr);
            int[] iArr2 = {igImageView.getWidth(), igImageView.getHeight()};
            c5se.A03 = "0_0";
            this.A0x = iArr;
            this.A0y = iArr2;
        }
    }

    public final void A01(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        this.A0J = c38321qM;
    }

    public final void A02(SourceModelInfoParams sourceModelInfoParams) {
        this.A0B = sourceModelInfoParams.A02;
        this.A09 = sourceModelInfoParams.A00;
        this.A0k = sourceModelInfoParams.A09;
        this.A0j = sourceModelInfoParams.A05;
        this.A0D = sourceModelInfoParams.A03;
        this.A0C = sourceModelInfoParams.A01;
        this.A0h = sourceModelInfoParams.A06;
    }

    public final boolean A03() {
        C40971v4 c40971v4;
        if (C18U.A06(C06090Tz.A05, this.A11, 36321713789871838L) && (c40971v4 = this.A0O) != null && c40971v4.A0l != null && c40971v4.A01 == AdFormatType.A04) {
            return true;
        }
        return false;
    }
}

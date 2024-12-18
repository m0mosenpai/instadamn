package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.HBr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38920HBr extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ReelDashboardFBViewerMessageBottomsheetFragment";
    public String A00;
    public String A01;
    public ImageUrl A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);
    public final String A08 = "reel_dashboard_fb_viewer_message_bottomsheet";

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            r3 = 0
            X.C14360o3.A0B(r6, r3)
            super.onViewCreated(r6, r7)
            r0 = 2131436255(0x7f0b22df, float:1.8494375E38)
            android.widget.TextView r4 = X.AbstractC167007dF.A0N(r6, r0)
            android.content.Context r2 = r5.requireContext()
            r1 = 2131971683(0x7f134e63, float:1.9580352E38)
            java.lang.String r0 = r5.A06
            if (r0 != 0) goto L23
            java.lang.String r0 = "viewerName"
        L1b:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L23:
            X.AbstractC31177DnL.A0r(r2, r4, r0, r1)
            r0 = 2131436258(0x7f0b22e2, float:1.8494381E38)
            android.widget.TextView r1 = X.AbstractC167007dF.A0N(r6, r0)
            java.lang.String r0 = r5.A03
            if (r0 != 0) goto L34
            java.lang.String r0 = "bottomsheetTitle"
            goto L1b
        L34:
            r1.setText(r0)
            java.lang.String r0 = r5.A05
            if (r0 == 0) goto L68
            r0 = 2131436256(0x7f0b22e0, float:1.8494377E38)
            android.widget.TextView r1 = X.AbstractC167007dF.A0N(r6, r0)
            java.lang.String r0 = r5.A05
        L44:
            r1.setText(r0)
            r1.setVisibility(r3)
        L4a:
            r0 = 2131437361(0x7f0b2731, float:1.8496618E38)
            android.view.View r2 = X.AbstractC166997dE.A0S(r6, r0)
            r1 = 5
            X.Cjt r0 = new X.Cjt
            r0.<init>(r5, r1)
            X.C0fQ.A00(r0, r2)
            r0 = 2131436257(0x7f0b22e1, float:1.849438E38)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = X.AbstractC167007dF.A0T(r6, r0)
            com.instagram.common.typedurl.ImageUrl r0 = r5.A02
            if (r0 != 0) goto L76
            java.lang.String r0 = "profilePicUrl"
            goto L1b
        L68:
            java.lang.String r0 = r5.A04
            if (r0 == 0) goto L4a
            r0 = 2131436256(0x7f0b22e0, float:1.8494377E38)
            android.widget.TextView r1 = X.AbstractC167007dF.A0N(r6, r0)
            java.lang.String r0 = r5.A04
            goto L44
        L76:
            r1.setUrl(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38920HBr.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A08;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        int A02 = C0f9.A02(-1039443742);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            String string = bundle2.getString("args_media_owner_obid");
            if (string != null) {
                this.A00 = string;
                String string2 = bundle2.getString(AbstractC111324zv.A00(736));
                if (string2 != null) {
                    this.A01 = string2;
                    String string3 = bundle2.getString("args_media_viewer_namme");
                    if (string3 != null) {
                        this.A06 = string3;
                        Parcelable parcelable = bundle2.getParcelable("args_profile_pic_url");
                        if (parcelable != null) {
                            this.A02 = (ImageUrl) parcelable;
                            String string4 = bundle2.getString("args_bottomsheet_title");
                            if (string4 != null) {
                                this.A03 = string4;
                                this.A04 = bundle2.getString("args_emoji_unicode");
                                this.A05 = bundle2.getString("args_reply_text");
                                C0f9.A09(-1408212204, A02);
                                return;
                            }
                            A14 = AbstractC166987dD.A14("Required value was null.");
                            i = 1703684520;
                        } else {
                            A14 = AbstractC166987dD.A14("Required value was null.");
                            i = 1506755492;
                        }
                    } else {
                        A14 = AbstractC166987dD.A14("Required value was null.");
                        i = -122807039;
                    }
                } else {
                    A14 = AbstractC166987dD.A14("Required value was null.");
                    i = -1421111537;
                }
            } else {
                A14 = AbstractC166987dD.A14("Required value was null.");
                i = -1021610842;
            }
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = -1976512512;
        }
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-2022427611);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.reel_dashboard_message_fb_viewer_bottomsheet, viewGroup, false);
        C0f9.A09(1292678938, A02);
        return inflate;
    }
}

package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.locationsharing.core.models.Address;
import com.facebook.locationsharing.core.models.Location;
import com.facebook.locationsharing.core.models.Place;
import com.facebook.locationsharing.core.models.PointOfInterest;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Fna, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35583Fna implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;

    public ViewOnClickListenerC35583Fna(Object obj, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
        this.A03 = z2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        boolean z;
        C66542ULx c66542ULx;
        Address address;
        C62967SZk c62967SZk;
        int i2;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(1117767881);
                C3DO c3do = C3DN.A00;
                C33211Ekz c33211Ekz = (C33211Ekz) this.A01;
                C189478aR A0x = AbstractC25228BEl.A0x(c33211Ekz.requireActivity(), c3do);
                if (A0x != null) {
                    boolean z2 = true;
                    if (this.A02 && (c33211Ekz.A03 || c33211Ekz.A05)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!this.A03 || !c33211Ekz.A04) {
                        z2 = false;
                    }
                    String str = c33211Ekz.A01;
                    Boolean valueOf = Boolean.valueOf(c33211Ekz.A03);
                    Bundle A0b = AbstractC166987dD.A0b();
                    A0b.putBoolean("show_text_translations_error_rows", z);
                    A0b.putBoolean("show_voice_translations_error_rows", z2);
                    A0b.putString("translation_error_media_id", str);
                    A0b.putBoolean("has_closed_caption_translations", AbstractC167007dF.A1T(valueOf));
                    C32258EIs c32258EIs = new C32258EIs();
                    c32258EIs.setArguments(A0b);
                    C189448aO A0g = AbstractC25231BEo.A0g(c33211Ekz.A06);
                    AbstractC25226BEj.A1M(c33211Ekz.requireContext(), A0g, 2131972414);
                    A0x.A0F(c32258EIs, A0g);
                }
                i = 1465920094;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A05 = C0f9.A05(-1020561988);
                V7T v7t = (V7T) this.A01;
                IgdsButton igdsButton = v7t.A04;
                if (igdsButton != null) {
                    igdsButton.setLoading(true);
                }
                if (this.A02) {
                    c66542ULx = v7t.A02;
                    if (c66542ULx != null) {
                        address = C66542ULx.A00(c66542ULx).A02;
                        if (address != null) {
                            AbstractC66543ULy.A04(c66542ULx, null, "LOADING");
                            c62967SZk = c66542ULx.A05;
                            i2 = 1;
                            c62967SZk.A01(new WUA(c66542ULx, i2), address);
                        }
                        i = 1506548039;
                    }
                    C14360o3.A0F("locationSharingPresenter");
                    throw C00O.createAndThrow();
                }
                boolean z3 = this.A03;
                c66542ULx = v7t.A02;
                if (z3) {
                    if (c66542ULx != null) {
                        int i3 = C66542ULx.A00(c66542ULx).A00;
                        ImmutableList immutableList = C66542ULx.A00(c66542ULx).A07;
                        if (i3 >= 0 && i3 < immutableList.size()) {
                            PointOfInterest pointOfInterest = (PointOfInterest) immutableList.get(i3);
                            String str2 = pointOfInterest.A02;
                            if (!TextUtils.isEmpty(str2)) {
                                String str3 = pointOfInterest.A04;
                                if (!TextUtils.isEmpty(str3)) {
                                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                                        AbstractC63311ShH.A04(str2, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                                        Location location = pointOfInterest.A00;
                                        AbstractC63311ShH.A04(location, "location");
                                        AbstractC63311ShH.A04(str3, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                                        Place place = new Place(location, str2, str3);
                                        AbstractC66543ULy.A04(c66542ULx, null, "LOADING");
                                        C62967SZk c62967SZk2 = c66542ULx.A05;
                                        DirectShareTarget directShareTarget = c62967SZk2.A01;
                                        if (directShareTarget != null) {
                                            C7TM A01 = C36911no.A00().E6g(c62967SZk2.A00).A01(directShareTarget);
                                            String str4 = place.A00;
                                            C14360o3.A07(str4);
                                            A01.ENe(null, directShareTarget, str4, place.A01, "", AbstractC111324zv.A00(2679), false);
                                        }
                                        AbstractC66543ULy.A04(c66542ULx, null, "LOADED");
                                        C66542ULx.A01(c66542ULx);
                                    } else {
                                        throw AbstractC166987dD.A12("\"pointOfInterest\" must pass \"isPlace()\"");
                                    }
                                }
                            }
                            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(pointOfInterest.A04)) {
                                throw AbstractC166987dD.A12("\"pointOfInterest\" must pass \"isAddress()\"");
                            }
                            String str5 = pointOfInterest.A01;
                            AbstractC63311ShH.A04(str5, "localizedAddress");
                            Location location2 = pointOfInterest.A00;
                            AbstractC63311ShH.A04(location2, "location");
                            address = new Address(location2, str5);
                            AbstractC66543ULy.A04(c66542ULx, null, "LOADING");
                            c62967SZk = c66542ULx.A05;
                            i2 = 2;
                            c62967SZk.A01(new WUA(c66542ULx, i2), address);
                        }
                        i = 1506548039;
                    }
                    C14360o3.A0F("locationSharingPresenter");
                    throw C00O.createAndThrow();
                }
                if (c66542ULx != null) {
                    c66542ULx.A0A(V7T.A0D);
                    i = 1506548039;
                }
                C14360o3.A0F("locationSharingPresenter");
                throw C00O.createAndThrow();
                C0f9.A0C(i, A05);
                return;
            case 2:
                A05 = C0f9.A05(-1809297400);
                boolean z4 = this.A02;
                C35042FcF c35042FcF = (C35042FcF) this.A01;
                if (z4) {
                    AbstractC35176FfT.A02(c35042FcF.A02.requireContext(), c35042FcF.A04, "invite_friends");
                    i = -5336414;
                } else {
                    EnumC33500ErZ enumC33500ErZ = EnumC33500ErZ.SYSTEM_SHARE_SHEET;
                    boolean z5 = this.A03;
                    UserSession userSession = c35042FcF.A04;
                    EnumC33510Erj enumC33510Erj = EnumC33510Erj.SETTINGS_AND_PRIVACY;
                    AbstractC35249Fgi.A03(enumC33510Erj, enumC33500ErZ, userSession, z5);
                    FYI.A01(c35042FcF.A02, enumC33510Erj, enumC33500ErZ, userSession, C05F.A15, null);
                    C35042FcF.A00(c35042FcF, null, "system_share_sheet");
                    i = -3687477;
                }
                C0f9.A0C(i, A05);
                return;
            default:
                A05 = C0f9.A05(-212538791);
                boolean z6 = this.A02;
                C35042FcF c35042FcF2 = (C35042FcF) this.A01;
                if (z6) {
                    AbstractC35176FfT.A02(c35042FcF2.A02.requireContext(), c35042FcF2.A04, "invite_friends");
                    i = 1217850937;
                } else {
                    EnumC33500ErZ enumC33500ErZ2 = EnumC33500ErZ.WHATSAPP;
                    boolean z7 = this.A03;
                    UserSession userSession2 = c35042FcF2.A04;
                    EnumC33510Erj enumC33510Erj2 = EnumC33510Erj.SETTINGS_AND_PRIVACY;
                    AbstractC35249Fgi.A03(enumC33510Erj2, enumC33500ErZ2, userSession2, z7);
                    FYI.A01(c35042FcF2.A02, enumC33510Erj2, enumC33500ErZ2, userSession2, C05F.A1F, null);
                    C35042FcF.A00(c35042FcF2, null, "whatsapp");
                    i = 1553478010;
                }
                C0f9.A0C(i, A05);
                return;
        }
    }
}

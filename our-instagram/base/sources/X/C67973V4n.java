package X;

import android.location.Location;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.fragment.LocationDetailFragment;
import com.instagram.discovery.mediamap.intf.MediaMapQuery;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.V4n, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67973V4n extends AbstractC60592pi implements InterfaceC71918XAc {
    public Location A00;
    public C38085GpE A01;
    public MediaMapPin A02;
    public C66095TzW A03;
    public C65823Tug A04;
    public C68034V7f A05;
    public AbstractC42425IqS A06;
    public AnonymousClass308 A07;
    public ILK A08;
    public W5E A09;
    public boolean A0A;
    public C57112jm A0B;
    public LocationDetailFragment A0C;
    public C71072WnU A0D;
    public C70846WiC A0E;
    public boolean A0F;
    public final FragmentActivity A0G;
    public final AbstractC59962oe A0H;
    public final UserSession A0I;
    public final LocationDetailFragment A0J;
    public final AbstractC018607g A0M;
    public final C69531Vqv A0O;
    public final LocationDetailFragment A0P;
    public final InterfaceC60442pS A0Q;
    public final List A0R = new ArrayList();
    public final Map A0S = new HashMap();
    public final InterfaceC153536vO A0N = new C70669Wep(this);
    public final String A0K = AbstractC166997dE.A0n();
    public final Map A0L = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v3, types: [X.2y7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [X.2zJ, java.lang.Object] */
    public static void A00(Location location, C67973V4n c67973V4n, boolean z) {
        AbstractC66422zJ exz;
        List list = c67973V4n.A0R;
        list.clear();
        Map map = c67973V4n.A0S;
        map.clear();
        c67973V4n.A0A = z;
        c67973V4n.A00 = location;
        EnumC68206VFy enumC68206VFy = EnumC68206VFy.A08;
        FragmentActivity fragmentActivity = c67973V4n.A0G;
        list.add(new W4N(enumC68206VFy, fragmentActivity.getString(2131975699), fragmentActivity.getString(2131963450)));
        EnumC68206VFy enumC68206VFy2 = EnumC68206VFy.A07;
        list.add(new W4N(enumC68206VFy2, fragmentActivity.getString(2131971543), fragmentActivity.getString(2131963451)));
        UserSession userSession = c67973V4n.A0I;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36315035114408917L)) {
            list.add(new W4N(EnumC68206VFy.A05, fragmentActivity.getString(2131955577), fragmentActivity.getString(2131955577)));
        }
        LocationPageInformation locationPageInformation = c67973V4n.A02.A06;
        if (locationPageInformation != null && locationPageInformation.A00() != null && C18U.A06(c06090Tz, userSession, 36315799618588218L)) {
            list.add(new W4N(EnumC68206VFy.A04, fragmentActivity.getString(2131952105), fragmentActivity.getString(2131952106)));
        }
        InterfaceC60442pS interfaceC60442pS = c67973V4n.A0Q;
        String str = c67973V4n.A0K;
        JIG A00 = AbstractC53972Ntj.A00(fragmentActivity, userSession, interfaceC60442pS, str, -1L, false, true);
        C57112jm A01 = AbstractC57052jg.A01(null, AbstractC57052jg.A00());
        c67973V4n.A0B = A01;
        c67973V4n.A08 = new ILK(A01, new C41587Iaa(interfaceC60442pS, userSession, null, null, str));
        c67973V4n.A0D = new C71072WnU(c67973V4n);
        List A002 = AbstractC68477VSi.A00(list);
        C71072WnU c71072WnU = c67973V4n.A0D;
        C68034V7f A012 = C68034V7f.A01(userSession, enumC68206VFy, new C70897Wjq(c67973V4n), new C1571273r(), c71072WnU, A002);
        c67973V4n.A05 = A012;
        C68036V7h c68036V7h = new C68036V7h(c67973V4n, 0);
        c67973V4n.A06 = c68036V7h;
        AbstractC59962oe abstractC59962oe = c67973V4n.A0H;
        C70901Wju c70901Wju = new C70901Wju(c67973V4n, 0);
        C37835Gkp c37835Gkp = new C37835Gkp();
        AbstractC25233BEq.A0v(1, abstractC59962oe, userSession, interfaceC60442pS);
        C14360o3.A0B(str, 9);
        C66392zG A003 = AbstractC38092GpL.A00(abstractC59962oe.requireContext(), abstractC59962oe, userSession, new Object(), c37835Gkp, c68036V7h, A012, c70901Wju, A00, interfaceC60442pS, null, str, false, false);
        A003.A01(new Object());
        if (c67973V4n.A0F) {
            exz = new C32600EXa(abstractC59962oe, interfaceC60442pS, userSession, c67973V4n.A0C);
        } else {
            exz = new EXZ(interfaceC60442pS, userSession, c67973V4n.A0P, c67973V4n.A0E);
        }
        A003.A01(exz);
        A003.A01(new V5G(userSession, c67973V4n.A0O));
        A003.A01(new V5H(userSession, c67973V4n));
        A003.A01(new Object());
        C70901Wju c70901Wju2 = new C70901Wju(c67973V4n, 0);
        C68034V7f c68034V7f = c67973V4n.A05;
        InterfaceC153536vO interfaceC153536vO = c67973V4n.A0N;
        AbstractC37302Gc3.A1U(c68034V7f, interfaceC153536vO);
        A003.A01(new C39080HIe(interfaceC153536vO, abstractC59962oe, userSession, c68034V7f, c70901Wju2));
        C71072WnU c71072WnU2 = c67973V4n.A0D;
        C68034V7f c68034V7f2 = c67973V4n.A05;
        AbstractC167017dG.A1R(c71072WnU2, c68034V7f2);
        c67973V4n.A03 = new C66095TzW(fragmentActivity, interfaceC60442pS, A003, userSession, c68034V7f2, null, null, null, null, c71072WnU2, false, false);
        C66101Tzc c66101Tzc = new C66101Tzc(userSession);
        c66101Tzc.A01(new C70895Wjo(c67973V4n, 0));
        C66095TzW c66095TzW = c67973V4n.A03;
        C14360o3.A0B(c66095TzW, 0);
        c66101Tzc.A06 = c66095TzW;
        C68034V7f c68034V7f3 = c67973V4n.A05;
        C14360o3.A0B(c68034V7f3, 0);
        c66101Tzc.A08 = c68034V7f3;
        c66101Tzc.A0A = A00;
        c66101Tzc.A04 = abstractC59962oe;
        c66101Tzc.A02(C38U.A00);
        c66101Tzc.A0N = false;
        c66101Tzc.A00(c67973V4n.A0B);
        c66101Tzc.A0I = true;
        c67973V4n.A04 = new C65823Tug(c66101Tzc);
        String A013 = AbstractC69973Vyo.A01(c67973V4n.A02);
        AbstractC018607g abstractC018607g = c67973V4n.A0M;
        map.put(enumC68206VFy, new C69413Vmx(userSession, enumC68206VFy, new C154796xU(fragmentActivity, abstractC018607g, userSession), null, A013, AbstractC166997dE.A0n(), null, true));
        map.put(enumC68206VFy2, new C69413Vmx(userSession, enumC68206VFy2, new C154796xU(fragmentActivity, abstractC018607g, userSession), null, AbstractC69973Vyo.A01(c67973V4n.A02), AbstractC166997dE.A0n(), null, true));
        EnumC68206VFy enumC68206VFy3 = EnumC68206VFy.A05;
        map.put(enumC68206VFy3, new C69413Vmx(userSession, enumC68206VFy3, new C154796xU(fragmentActivity, abstractC018607g, userSession), null, AbstractC69973Vyo.A01(c67973V4n.A02), AbstractC166997dE.A0n(), null, true));
        MediaMapPin mediaMapPin = c67973V4n.A02;
        LocationPageInformation locationPageInformation2 = mediaMapPin.A06;
        if (locationPageInformation2 != null && locationPageInformation2.A00() != null) {
            EnumC68206VFy enumC68206VFy4 = EnumC68206VFy.A04;
            map.put(enumC68206VFy4, new C69413Vmx(userSession, enumC68206VFy4, new C154796xU(fragmentActivity, abstractC018607g, userSession), null, AbstractC69973Vyo.A01(mediaMapPin), AbstractC166997dE.A0n(), c67973V4n.A02.A06.A00().getId(), true));
        }
        c67973V4n.A09 = new W5E(fragmentActivity, abstractC018607g, userSession, null, null, new C70969WlG(c67973V4n), null, AbstractC69973Vyo.A01(c67973V4n.A02), map, true);
        c67973V4n.A04.A05(abstractC59962oe.requireView(), AbstractC37303Gc4.A1a(W5E.A00(c67973V4n.A09, c67973V4n.A05.A00).A04));
        C65823Tug.A00(c67973V4n.A04, false, true);
        c67973V4n.A04.A06(c67973V4n.A0D);
        c67973V4n.A05.A08(enumC68206VFy, true);
        c67973V4n.A09.A01(c67973V4n.A05.A00, true, false);
        A01(enumC68206VFy, c67973V4n);
        AnonymousClass308 anonymousClass308 = new AnonymousClass308(fragmentActivity, abstractC59962oe, abstractC59962oe.getParentFragmentManager(), userSession, interfaceC60442pS, c67973V4n.A04.A0E, null, false);
        c67973V4n.A07 = anonymousClass308;
        abstractC59962oe.registerLifecycleListener(anonymousClass308);
    }

    public static void A01(EnumC68206VFy enumC68206VFy, C67973V4n c67973V4n) {
        List list = (List) c67973V4n.A0L.get(enumC68206VFy);
        c67973V4n.A02(enumC68206VFy, list);
        if (list != null) {
            c67973V4n.A05.A07(enumC68206VFy, list);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.5yw, java.lang.Object] */
    private void A02(EnumC68206VFy enumC68206VFy, List list) {
        boolean z;
        MediaMapPin mediaMapPin = this.A02;
        LocationPageInformation locationPageInformation = mediaMapPin.A06;
        User user = null;
        if (locationPageInformation == null) {
            z = false;
        } else {
            user = locationPageInformation.A00();
            z = locationPageInformation.A0C;
        }
        ArrayList arrayList = new ArrayList();
        boolean z2 = this.A0F;
        if (!z2) {
            arrayList.add(new V5Z(mediaMapPin));
        }
        if (user != null) {
            AbstractC69973Vyo.A00(mediaMapPin.A09);
            arrayList.add(new C36217FyW(user, AbstractC69973Vyo.A00(this.A02.A09).A04(), z));
        }
        if (z2) {
            arrayList.add(new V5Z(this.A02));
        }
        List list2 = this.A0R;
        ?? obj = new Object();
        obj.A02 = list2;
        obj.A00 = enumC68206VFy;
        arrayList.add(obj);
        if (!AbstractC37303Gc4.A1a(W5E.A00(this.A09, this.A05.A00).A04) && (list == null || list.isEmpty())) {
            arrayList.add(new Object());
        }
        this.A05.A09(arrayList);
    }

    public static void A03(C67973V4n c67973V4n, boolean z) {
        if (!AbstractC37303Gc4.A1a(W5E.A00(c67973V4n.A09, c67973V4n.A05.A00).A04)) {
            if (c67973V4n.A09.A02(c67973V4n.A05.A00) || z) {
                c67973V4n.A09.A01(c67973V4n.A05.A00, false, false);
            }
        }
    }

    @Override // X.InterfaceC71918XAc
    public final void Drm(EnumC68206VFy enumC68206VFy) {
        WGA A0V;
        MediaMapPin mediaMapPin;
        MediaMapQuery mediaMapQuery;
        String str;
        if (enumC68206VFy == EnumC68206VFy.A08) {
            LocationDetailFragment locationDetailFragment = this.A0J;
            A0V = AbstractC31173DnH.A0V(locationDetailFragment);
            mediaMapPin = locationDetailFragment.A03;
            mediaMapQuery = locationDetailFragment.A02;
            str = "instagram_map_location_detail_tap_top";
        } else if (enumC68206VFy == EnumC68206VFy.A07) {
            LocationDetailFragment locationDetailFragment2 = this.A0J;
            A0V = AbstractC31173DnH.A0V(locationDetailFragment2);
            mediaMapPin = locationDetailFragment2.A03;
            mediaMapQuery = locationDetailFragment2.A02;
            str = "instagram_map_location_detail_tap_recent";
        } else {
            if (enumC68206VFy == EnumC68206VFy.A04) {
                LocationDetailFragment locationDetailFragment3 = this.A0J;
                A0V = AbstractC31173DnH.A0V(locationDetailFragment3);
                mediaMapPin = locationDetailFragment3.A03;
                mediaMapQuery = locationDetailFragment3.A02;
                str = "instagram_map_location_detail_tap_account";
            }
            this.A05.A08(enumC68206VFy, true);
            A02(enumC68206VFy, (List) this.A0L.get(enumC68206VFy));
        }
        AbstractC31173DnH.A1W(mediaMapQuery, A0V, mediaMapPin, str);
        this.A05.A08(enumC68206VFy, true);
        A02(enumC68206VFy, (List) this.A0L.get(enumC68206VFy));
    }

    public C67973V4n(Location location, FragmentActivity fragmentActivity, AbstractC018607g abstractC018607g, AbstractC59962oe abstractC59962oe, UserSession userSession, C69531Vqv c69531Vqv, LocationDetailFragment locationDetailFragment, LocationDetailFragment locationDetailFragment2, LocationDetailFragment locationDetailFragment3, C70846WiC c70846WiC, MediaMapPin mediaMapPin, InterfaceC60442pS interfaceC60442pS, boolean z, boolean z2) {
        this.A0G = fragmentActivity;
        this.A0I = userSession;
        this.A0F = z2;
        this.A0H = abstractC59962oe;
        this.A0Q = interfaceC60442pS;
        this.A0M = abstractC018607g;
        this.A02 = mediaMapPin;
        this.A0P = locationDetailFragment;
        this.A0J = locationDetailFragment2;
        this.A0O = c69531Vqv;
        this.A0E = c70846WiC;
        this.A0C = locationDetailFragment3;
        A00(location, this, z);
    }
}

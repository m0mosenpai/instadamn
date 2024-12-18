package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.BaseBundle;
import android.util.SparseArray;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.android.gms.vision.barcode.Barcode;
import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Shl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63334Shl {
    public long A00;
    public C63132Sdd A01;
    public String A02;
    public HashMap A03;
    public final Context A04;
    public final InterfaceC08100bW A05 = AbstractC31175DnJ.A0B();
    public final UserSession A06;

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.vision.zzk, java.lang.Object] */
    public static final C3AY A00(C62681SLu c62681SLu, C63334Shl c63334Shl) {
        int i;
        PackageManager packageManager;
        try {
            packageManager = c63334Shl.A04.getPackageManager();
        } catch (Exception unused) {
            i = 0;
        }
        if (packageManager != null) {
            i = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
            if (i >= 9452000) {
                Context context = c63334Shl.A04;
                ?? obj = new Object();
                obj.A00 = 256;
                C60729ROo c60729ROo = new C60729ROo(new C60727ROl(context, obj));
                if (c60729ROo.A00.A00() != null) {
                    SparseArray A01 = c60729ROo.A01(c62681SLu);
                    int size = A01.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Object obj2 = A01.get(A01.keyAt(i2));
                        if (obj2 != null) {
                            String str = ((Barcode) obj2).A0C;
                            C14360o3.A0A(str);
                            C3AY A02 = A02(c63334Shl, str);
                            if (A02 != null) {
                                return A02;
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                }
            }
            return null;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public static final C3AY A01(AbstractC62743SOk abstractC62743SOk, C63334Shl c63334Shl) {
        RaM raM;
        SJ5 A01;
        Y1j[] y1jArr;
        SNz sNz;
        C63132Sdd c63132Sdd;
        SJ5 A012;
        Y1j[] y1jArr2;
        C63132Sdd c63132Sdd2 = c63334Shl.A01;
        if (c63132Sdd2 == null) {
            c63132Sdd2 = new C63132Sdd();
        }
        c63334Shl.A01 = c63132Sdd2;
        HashMap hashMap = c63334Shl.A03;
        if (hashMap == null) {
            hashMap = AbstractC166987dD.A1G();
        }
        c63334Shl.A03 = hashMap;
        AbstractC31173DnH.A1Y(EnumC72361Xbx.TRY_HARDER, hashMap, true);
        RaM raM2 = new RaM(abstractC62743SOk);
        try {
            c63132Sdd = c63334Shl.A01;
        } catch (RaQ | C60880RaR | C60881RaS unused) {
        }
        try {
            if (c63132Sdd != null) {
                HashMap hashMap2 = c63334Shl.A03;
                if (hashMap2 != null && hashMap2.containsKey(EnumC72361Xbx.PURE_BARCODE)) {
                    A012 = c63132Sdd.A00.A01(C63132Sdd.A00(raM2.A00()), hashMap2);
                    y1jArr2 = C63132Sdd.A01;
                } else {
                    C62512SEo A03 = new Y4e(raM2.A00()).A03(hashMap2);
                    A012 = c63132Sdd.A00.A01(A03.A00, hashMap2);
                    y1jArr2 = A03.A01;
                }
                if ((A012.A00 instanceof C72584XhO) && y1jArr2.length >= 3) {
                    Y1j y1j = y1jArr2[0];
                    y1jArr2[0] = y1jArr2[2];
                    y1jArr2[2] = y1j;
                }
                sNz = new SNz(A012.A04, A012.A06, y1jArr2);
                List list = A012.A05;
                if (list != null) {
                    sNz.A00(EnumC61141Rfv.BYTE_SEGMENTS, list);
                }
                A03(sNz, A012);
                return A02(c63334Shl, AbstractC166987dD.A19(sNz));
            }
            C63132Sdd c63132Sdd3 = c63334Shl.A01;
            if (c63132Sdd3 != null) {
                HashMap hashMap3 = c63334Shl.A03;
                if (hashMap3 != null && hashMap3.containsKey(EnumC72361Xbx.PURE_BARCODE)) {
                    A01 = c63132Sdd3.A00.A01(C63132Sdd.A00(raM.A00()), hashMap3);
                    y1jArr = C63132Sdd.A01;
                } else {
                    C62512SEo A032 = new Y4e(raM.A00()).A03(hashMap3);
                    A01 = c63132Sdd3.A00.A01(A032.A00, hashMap3);
                    y1jArr = A032.A01;
                }
                if ((A01.A00 instanceof C72584XhO) && y1jArr.length >= 3) {
                    Y1j y1j2 = y1jArr[0];
                    y1jArr[0] = y1jArr[2];
                    y1jArr[2] = y1j2;
                }
                sNz = new SNz(A01.A04, A01.A06, y1jArr);
                List list2 = A01.A05;
                if (list2 != null) {
                    sNz.A00(EnumC61141Rfv.BYTE_SEGMENTS, list2);
                }
                A03(sNz, A01);
                return A02(c63334Shl, AbstractC166987dD.A19(sNz));
            }
        } catch (RaQ | C60880RaR | C60881RaS unused2) {
        }
        raM = new RaM(new RaN(abstractC62743SOk));
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.0Ml, java.lang.Object] */
    public static final C3AY A02(C63334Shl c63334Shl, String str) {
        String str2;
        EnumC61133Rfn enumC61133Rfn;
        UserSession userSession = c63334Shl.A06;
        C14360o3.A0B(userSession, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(new C12210kP(userSession).A00(), "ig_qr_code_url_parsed");
        try {
            A0f.AAP("sanitized_url", new Object().A03(AbstractC08820cl.A03(str), null).F7g());
            C14K c14k = C14J.A04;
            C14J A00 = c14k.A00();
            if (A00 != null) {
                C3AY A002 = A00.A00(userSession, str);
                if (A002 != null) {
                    Object obj = A002.A00;
                    if (obj != null) {
                        A0f.AAP("legacy_handler_name", AbstractC31173DnH.A0q(obj));
                        A0f.Cht();
                        Object obj2 = A002.A01;
                        if (obj2 != null) {
                            String string = ((BaseBundle) obj2).getString(AbstractC111324zv.A00(3653));
                            if (string != null) {
                                return new C3AY(EnumC61133Rfn.A06, string);
                            }
                            enumC61133Rfn = EnumC61133Rfn.A05;
                            return new C3AY(enumC61133Rfn, str);
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            if (c14k.A00() != null) {
                Context context = c63334Shl.A04;
                if (str != null && AbstractC35278FhD.A0G(context, str) != null) {
                    A0f.A7v("is_handled_by_dfa", true);
                    A0f.Cht();
                    enumC61133Rfn = EnumC61133Rfn.A05;
                    return new C3AY(enumC61133Rfn, str);
                }
            }
            android.net.Uri A01 = AbstractC08820cl.A01(c63334Shl.A05, str);
            if (A01 != null) {
                str2 = A01.getScheme();
            } else {
                str2 = null;
            }
            if (C14360o3.A0K(str2, "barcelona") && AbstractC14490oL.A09(c63334Shl.A04)) {
                enumC61133Rfn = EnumC61133Rfn.A03;
                return new C3AY(enumC61133Rfn, str);
            }
            try {
                String[] A1b = AbstractC31173DnH.A1b(AbstractC31175DnJ.A0h("www.fujitv.co.jp,fujitv.co.jp", InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1), 0);
                if (AbstractC001800i.A0u(AbstractC16960so.A1Q(Arrays.copyOf(A1b, A1b.length)), AbstractC25227BEk.A0B(str).getAuthority())) {
                    A0f.A7v("is_allowed_domain", true);
                    A0f.Cht();
                    return new C3AY(EnumC61133Rfn.A02, str);
                }
            } catch (Exception unused) {
            }
            if (!C14360o3.A0K(str, c63334Shl.A02) || System.currentTimeMillis() - c63334Shl.A00 > LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) {
                C9GR.A01(c63334Shl.A04, null, 2131971198, 0);
                c63334Shl.A00 = System.currentTimeMillis();
            }
            c63334Shl.A02 = str;
            return null;
        } catch (SecurityException unused2) {
            A0f.A7v("has_legacy_error", true);
            A0f.Cht();
            return null;
        }
    }

    public static void A03(SNz sNz, SJ5 sj5) {
        int i;
        sNz.A00(EnumC61141Rfv.ERROR_CORRECTION_LEVEL, sj5.A03);
        int i2 = sj5.A01;
        if (i2 >= 0 && (i = sj5.A02) >= 0) {
            sNz.A00(EnumC61141Rfv.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(i));
            sNz.A00(EnumC61141Rfv.STRUCTURED_APPEND_PARITY, Integer.valueOf(i2));
        }
    }

    public C63334Shl(Context context, UserSession userSession) {
        this.A04 = context;
        this.A06 = userSession;
    }
}

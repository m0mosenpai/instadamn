package X;

import android.content.Intent;
import android.text.TextUtils;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5Nu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C116155Nu {
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public C45122Jxr A05;
    public C45127Jxw A06;
    public EnumC47122Ee A07;
    public C50B A08;
    public MOG A09;
    public C5f9 A0A;
    public PushChannelType A0B;
    public ImageUrl A0C;
    public ImageUrl A0D;
    public ImageUrl A0E;
    public Boolean A0F;
    public Boolean A0G;
    public Integer A0H;
    public Integer A0I;
    public Long A0J;
    public Long A0K;
    public Long A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
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
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public String A0p;
    public String A0q;
    public String A0r;
    public String A0s;
    public String A0t;
    public String A0u;
    public String A0v;
    public String A0w;
    public String A0x;
    public String A0y;
    public String A0z;
    public String A10;
    public String A11;
    public String A12;
    public String A13;
    public String A14;
    public String A15;
    public String A16;
    public String A17;
    public String A18;
    public String A19;
    public String A1A;
    public String A1B;
    public String A1C;
    public String A1D;
    public String A1E;
    public String A1F;
    public String A1G;
    public String A1H;
    public String A1I;
    public HashMap A1J;
    public List A1K;
    public List A1L;
    public boolean A1M;
    public boolean A1N;
    public boolean A1O;
    public boolean A1P;
    public boolean A1Q;
    public boolean A1R;
    public boolean A1S;
    public boolean A1T;
    public boolean A1U;
    public transient String A1V;

    public C116155Nu(C50B c50b, ImageUrl imageUrl, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.A1O = true;
        this.A03 = System.currentTimeMillis();
        this.A1N = false;
        this.A14 = null;
        this.A0B = PushChannelType.A0D;
        this.A07 = EnumC47122Ee.A0c;
        this.A00 = -1.0f;
        this.A01 = 0;
        this.A02 = 0;
        this.A0Z = null;
        this.A1T = false;
        this.A1L = null;
        this.A1M = false;
        this.A0K = 0L;
        this.A05 = null;
        this.A1I = str;
        this.A0r = str2;
        this.A1D = null;
        this.A1H = null;
        this.A0g = str3;
        this.A0X = str4;
        this.A0D = null;
        this.A0C = imageUrl;
        this.A0E = null;
        this.A1C = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
        this.A12 = str5;
        this.A11 = str6;
        this.A0j = str7;
        this.A08 = c50b;
        this.A0h = null;
        this.A1V = null;
        this.A1K = null;
        this.A0e = null;
        this.A0s = null;
        this.A16 = null;
        this.A0f = str8;
        this.A17 = null;
        this.A1A = str9;
        this.A0P = null;
        this.A1Q = bool.booleanValue();
        this.A1P = bool2.booleanValue();
        this.A1O = bool3.booleanValue();
        this.A0z = str10;
        this.A0v = str11;
    }

    public static C116155Nu A00(Intent intent, String str, boolean z) {
        String stringExtra;
        C116155Nu A01;
        if (!intent.hasExtra("data") || (A01 = A01((stringExtra = intent.getStringExtra("data")), str)) == null) {
            return null;
        }
        if (z) {
            A01.A14 = stringExtra;
        }
        if (A01.A0X == null) {
            String stringExtra2 = intent.getStringExtra("collapse_key");
            if (stringExtra2 == null) {
                stringExtra2 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
            }
            A01.A0X = stringExtra2;
        }
        return A01;
    }

    public final MOG A03() {
        if (this.A09 == null && !TextUtils.isEmpty(this.A0a)) {
            this.A09 = new C48286LYk(Integer.parseInt(this.A0a));
        }
        return this.A09;
    }

    public final String A04() {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            A0A.A0d();
            String str = this.A1I;
            if (str != null) {
                A0A.A0S("t", str);
            }
            String str2 = this.A0r;
            if (str2 != null) {
                A0A.A0S("m", str2);
            }
            String str3 = this.A0t;
            if (str3 != null) {
                A0A.A0S("brf", str3);
            }
            String str4 = this.A1D;
            if (str4 != null) {
                A0A.A0S("st", str4);
            }
            String str5 = this.A1H;
            if (str5 != null) {
                A0A.A0S("tt", str5);
            }
            if (this.A06 != null) {
                A0A.A0r("dedup");
                C45127Jxw c45127Jxw = this.A06;
                A0A.A0d();
                String str6 = c45127Jxw.A01;
                if (str6 != null) {
                    A0A.A0S("ch", str6);
                }
                Number number = (Number) c45127Jxw.A00;
                if (number != null) {
                    A0A.A0R("ttl", number.longValue());
                }
                A0A.A0a();
            }
            String str7 = this.A0g;
            if (str7 != null) {
                A0A.A0S("ig", str7);
            }
            String str8 = this.A15;
            if (str8 != null) {
                A0A.A0S("r_cc", str8);
            }
            String str9 = this.A0X;
            if (str9 != null) {
                A0A.A0S("collapse_key", str9);
            }
            if (this.A0D != null) {
                A0A.A0r("i");
                AbstractC222616c.A01(A0A, this.A0D);
            }
            if (this.A0C != null) {
                A0A.A0r("a");
                AbstractC222616c.A01(A0A, this.A0C);
            }
            if (this.A0E != null) {
                A0A.A0r("ei");
                AbstractC222616c.A01(A0A, this.A0E);
            }
            String str10 = this.A1C;
            if (str10 != null) {
                A0A.A0S("sound", str10);
            }
            String str11 = this.A12;
            if (str11 != null) {
                A0A.A0S("pi", str11);
            }
            if (this.A0A != null) {
                A0A.A0r("pim");
                C5f8.A00(A0A, this.A0A);
            }
            String str12 = this.A11;
            if (str12 != null) {
                A0A.A0S("c", str12);
            }
            String str13 = this.A13;
            if (str13 != null) {
                A0A.A0S("ti", str13);
            }
            String str14 = this.A0j;
            if (str14 != null) {
                A0A.A0S("u", str14);
            }
            if (this.A08 != null) {
                A0A.A0r("bc");
                A0A.A0u(AbstractC116175Nw.A00(this.A08));
            }
            String str15 = this.A0h;
            if (str15 != null) {
                A0A.A0S("ia", str15);
            }
            String str16 = this.A0e;
            if (str16 != null) {
                A0A.A0S("hpa", str16);
            }
            String str17 = this.A0s;
            if (str17 != null) {
                A0A.A0S("cc", str17);
            }
            String str18 = this.A0f;
            if (str18 != null) {
                A0A.A0S("gid", str18);
            }
            String str19 = this.A16;
            if (str19 != null) {
                A0A.A0S("rid", str19);
            }
            String str20 = this.A17;
            if (str20 != null) {
                A0A.A0S("rtc_m", str20);
            }
            String str21 = this.A18;
            if (str21 != null) {
                A0A.A0S("rtc_z", str21);
            }
            String str22 = this.A1A;
            if (str22 != null) {
                A0A.A0S("s", str22);
            }
            String str23 = this.A19;
            if (str23 != null) {
                A0A.A0S("sna", str23);
            }
            A0A.A0T("shh", this.A1U);
            String str24 = this.A0l;
            if (str24 != null) {
                A0A.A0S("lat", str24);
            }
            String str25 = this.A0n;
            if (str25 != null) {
                A0A.A0S("long", str25);
            }
            String str26 = this.A0m;
            if (str26 != null) {
                A0A.A0S("loc", str26);
            }
            String str27 = this.A0k;
            if (str27 != null) {
                A0A.A0S("device_name", str27);
            }
            String str28 = this.A0o;
            if (str28 != null) {
                A0A.A0S(AbstractC37315GcH.A00(0, 9, 89), str28);
            }
            String str29 = this.A0p;
            if (str29 != null) {
                A0A.A0S("time", str29);
            }
            String str30 = this.A0q;
            if (str30 != null) {
                A0A.A0S("tf_id", str30);
            }
            Boolean bool = this.A0G;
            if (bool != null) {
                A0A.A0T("cf", bool.booleanValue());
            }
            String str31 = this.A0u;
            if (str31 != null) {
                A0A.A0S("ts", str31);
            }
            String str32 = this.A0O;
            if (str32 != null) {
                A0A.A0S("message_type_id", str32);
            }
            String str33 = this.A0N;
            if (str33 != null) {
                A0A.A0S("message_type", str33);
            }
            String str34 = this.A0P;
            if (str34 != null) {
                A0A.A0S("payload", str34);
            }
            String str35 = this.A0U;
            if (str35 != null) {
                A0A.A0S("wa_push_id", str35);
            }
            String str36 = this.A0S;
            if (str36 != null) {
                A0A.A0S("sn", str36);
            }
            String str37 = this.A0R;
            if (str37 != null) {
                A0A.A0S("su", str37);
            }
            String str38 = this.A0M;
            if (str38 != null) {
                A0A.A0S("gn", str38);
            }
            String str39 = this.A0Q;
            if (str39 != null) {
                A0A.A0S("rn", str39);
            }
            String str40 = this.A0T;
            if (str40 != null) {
                A0A.A0S("tid", str40);
            }
            A0A.A0T("is_thread_muted", this.A1Q);
            A0A.A0T("is_thread_hidden", this.A1P);
            A0A.A0T("is_fg", this.A1O);
            String str41 = this.A0z;
            if (str41 != null) {
                A0A.A0S("atid", str41);
            }
            String str42 = this.A0x;
            if (str42 != null) {
                A0A.A0S("mtr_id", str42);
            }
            String str43 = this.A0c;
            if (str43 != null) {
                A0A.A0S("exp", str43);
            }
            String str44 = this.A0a;
            if (str44 != null) {
                A0A.A0S("tp", str44);
            }
            String str45 = this.A0b;
            if (str45 != null) {
                A0A.A0S("t_t", str45);
            }
            A0A.A0T("is_e2ee_badge_calculated", this.A1R);
            Boolean bool2 = this.A0F;
            if (bool2 != null) {
                A0A.A0T("mw", bool2.booleanValue());
            }
            Long l = this.A0J;
            if (l != null) {
                A0A.A0R("ntlt", l.longValue());
            }
            A0A.A0R("NOTIFICATION_CREATED_TIMESTAMP", this.A03);
            A0A.A0R("nf", this.A04);
            String str46 = this.A0W;
            if (str46 != null) {
                A0A.A0S("jl_hash", str46);
            }
            String str47 = this.A0V;
            if (str47 != null) {
                A0A.A0S("di_id", str47);
            }
            A0A.A0T("is_instamadillo", this.A1S);
            String str48 = this.A0i;
            if (str48 != null) {
                A0A.A0S("itt", str48);
            }
            String str49 = this.A1G;
            if (str49 != null) {
                A0A.A0S("thread_igid", str49);
            }
            String str50 = this.A1F;
            if (str50 != null) {
                A0A.A0S("t_id", str50);
            }
            String str51 = this.A10;
            if (str51 != null) {
                A0A.A0S("pay_nonce", str51);
            }
            String str52 = this.A0d;
            if (str52 != null) {
                A0A.A0S("grpid", str52);
            }
            if (this.A1J != null) {
                A0A.A0r("tkids");
                A0A.A0d();
                for (Map.Entry entry : this.A1J.entrySet()) {
                    if (!C16V.A04(A0A, entry)) {
                        A0A.A0u((String) entry.getValue());
                    }
                }
                A0A.A0a();
            }
            String str53 = this.A0y;
            if (str53 != null) {
                A0A.A0S("muid", str53);
            }
            PushChannelType pushChannelType = this.A0B;
            if (pushChannelType != null) {
                A0A.A0S("delivery_channel", pushChannelType.A01);
            }
            EnumC47122Ee enumC47122Ee = this.A07;
            if (enumC47122Ee != null) {
                A0A.A0S("achid", enumC47122Ee.A00);
            }
            String str54 = this.A1E;
            if (str54 != null) {
                A0A.A0S("f", str54);
            }
            String str55 = this.A0Y;
            if (str55 != null) {
                A0A.A0S("ch", str55);
            }
            A0A.A0P("sndtm", this.A00);
            A0A.A0Q("cdlw", this.A01);
            A0A.A0Q("ls", this.A02);
            String str56 = this.A1B;
            if (str56 != null) {
                A0A.A0S("sort_key", str56);
            }
            if (this.A05 != null) {
                A0A.A0r("direct_metadata");
                C45122Jxr c45122Jxr = this.A05;
                A0A.A0d();
                Number number2 = (Number) c45122Jxr.A01;
                if (number2 != null) {
                    A0A.A0R("expire_ms", number2.longValue());
                }
                Boolean bool3 = (Boolean) c45122Jxr.A00;
                if (bool3 != null) {
                    A0A.A0T("is_dm", bool3.booleanValue());
                }
                A0A.A0a();
            }
            A0A.A0a();
            A0A.close();
            return stringWriter.toString();
        } catch (IOException e) {
            C0K8.A05(C116155Nu.class, "Unexpected IO exception", e);
            return "";
        }
    }

    public final boolean A05() {
        if (this.A0B != PushChannelType.A0B) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C116155Nu)) {
            return false;
        }
        C116155Nu c116155Nu = (C116155Nu) obj;
        if (!AbstractC50102Ry.A00(this.A1I, c116155Nu.A1I) || !AbstractC50102Ry.A00(this.A0r, c116155Nu.A0r) || !AbstractC50102Ry.A00(this.A1D, c116155Nu.A1D)) {
            return false;
        }
        String str = this.A1H;
        if (str == null) {
            str = this.A0r;
        }
        String str2 = c116155Nu.A1H;
        if (str2 == null) {
            str2 = c116155Nu.A0r;
        }
        if (!AbstractC50102Ry.A00(str, str2) || !AbstractC50102Ry.A00(this.A0g, c116155Nu.A0g) || !AbstractC50102Ry.A00(this.A0X, c116155Nu.A0X) || !AbstractC50102Ry.A00(this.A1C, c116155Nu.A1C) || !AbstractC50102Ry.A00(this.A08, c116155Nu.A08) || !AbstractC50102Ry.A00(this.A0h, c116155Nu.A0h) || !AbstractC50102Ry.A00(this.A1K, c116155Nu.A1K) || !AbstractC50102Ry.A00(this.A0s, c116155Nu.A0s) || !AbstractC50102Ry.A00(this.A17, c116155Nu.A17) || !AbstractC50102Ry.A00(this.A0G, c116155Nu.A0G) || !AbstractC50102Ry.A00(this.A0D, c116155Nu.A0D) || !AbstractC50102Ry.A00(this.A0C, c116155Nu.A0C) || !AbstractC50102Ry.A00(this.A0E, c116155Nu.A0E) || !AbstractC50102Ry.A00(this.A0j, c116155Nu.A0j) || !AbstractC50102Ry.A00(this.A16, c116155Nu.A16) || !AbstractC50102Ry.A00(this.A0f, c116155Nu.A0f) || !AbstractC50102Ry.A00(this.A1A, c116155Nu.A1A) || !AbstractC50102Ry.A00(this.A12, c116155Nu.A12) || !AbstractC50102Ry.A00(this.A11, c116155Nu.A11) || !AbstractC50102Ry.A00(this.A0B, c116155Nu.A0B) || !AbstractC50102Ry.A00(this.A0l, c116155Nu.A0l) || !AbstractC50102Ry.A00(this.A0n, c116155Nu.A0n) || !AbstractC50102Ry.A00(this.A0m, c116155Nu.A0m) || !AbstractC50102Ry.A00(this.A0k, c116155Nu.A0k) || !AbstractC50102Ry.A00(this.A0o, c116155Nu.A0o) || !AbstractC50102Ry.A00(this.A0p, c116155Nu.A0p) || !AbstractC50102Ry.A00(this.A0q, c116155Nu.A0q) || !AbstractC50102Ry.A00(this.A0O, c116155Nu.A0O) || !AbstractC50102Ry.A00(this.A0N, c116155Nu.A0N) || !AbstractC50102Ry.A00(this.A0P, c116155Nu.A0P) || !AbstractC50102Ry.A00(this.A0U, c116155Nu.A0U) || !AbstractC50102Ry.A00(this.A0S, c116155Nu.A0S) || !AbstractC50102Ry.A00(this.A0R, c116155Nu.A0R) || !AbstractC50102Ry.A00(this.A0M, c116155Nu.A0M) || !AbstractC50102Ry.A00(this.A0Q, c116155Nu.A0Q) || !AbstractC50102Ry.A00(this.A0T, c116155Nu.A0T) || !AbstractC50102Ry.A00(Boolean.valueOf(this.A1P), Boolean.valueOf(c116155Nu.A1P)) || !AbstractC50102Ry.A00(Boolean.valueOf(this.A1Q), Boolean.valueOf(c116155Nu.A1Q)) || !AbstractC50102Ry.A00(Boolean.valueOf(this.A1O), Boolean.valueOf(c116155Nu.A1O)) || !AbstractC50102Ry.A00(this.A0c, c116155Nu.A0c) || !AbstractC50102Ry.A00(this.A0a, c116155Nu.A0a) || !AbstractC50102Ry.A00(this.A0b, c116155Nu.A0b) || !AbstractC50102Ry.A00(this.A0Z, c116155Nu.A0Z) || !AbstractC50102Ry.A00(Boolean.valueOf(this.A1U), Boolean.valueOf(c116155Nu.A1U)) || !AbstractC50102Ry.A00(this.A0W, c116155Nu.A0W) || !AbstractC50102Ry.A00(this.A0V, c116155Nu.A0V) || !AbstractC50102Ry.A00(this.A0I, c116155Nu.A0I) || !AbstractC50102Ry.A00(this.A0d, c116155Nu.A0d) || !AbstractC50102Ry.A00(this.A0H, c116155Nu.A0H) || !AbstractC50102Ry.A00(this.A0A, c116155Nu.A0A) || !AbstractC50102Ry.A00(this.A0Y, c116155Nu.A0Y) || !AbstractC50102Ry.A00(Float.valueOf(this.A00), Float.valueOf(c116155Nu.A00)) || !AbstractC50102Ry.A00(Integer.valueOf(this.A01), Integer.valueOf(c116155Nu.A01)) || !AbstractC50102Ry.A00(Integer.valueOf(this.A02), Integer.valueOf(c116155Nu.A02))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[68];
        System.arraycopy(new Object[]{this.A1I, this.A0r, this.A1D, this.A1H, this.A0g, this.A0D, this.A0C, this.A0E, this.A0X, this.A1C, this.A12, this.A11, this.A13, this.A0j, this.A08, this.A0h, this.A1K, this.A0s, this.A16, this.A0f, this.A17, this.A1A, this.A19, Boolean.valueOf(this.A1U), this.A0l, this.A0n, this.A0m}, 0, objArr, 0, 27);
        System.arraycopy(new Object[]{this.A0k, this.A0o, this.A0p, this.A0q, this.A0G, this.A0B, this.A0O, this.A0N, this.A0P, this.A0U, this.A0S, this.A0R, this.A0M, this.A0Q, this.A0T, Boolean.valueOf(this.A1Q), Boolean.valueOf(this.A1P), Boolean.valueOf(this.A1O), Boolean.valueOf(this.A1S), this.A0i, this.A1F, this.A1G, this.A1E, this.A0z, this.A0v, this.A0x, this.A0c}, 0, objArr, 27, 27);
        System.arraycopy(new Object[]{this.A0a, this.A0b, this.A0Z, Boolean.valueOf(this.A1R), this.A0W, this.A0V, this.A0I, this.A0H, this.A0d, this.A0A, this.A0Y, Float.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A02)}, 0, objArr, 54, 14);
        return Arrays.hashCode(objArr);
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder sb = new StringBuilder("IgNotification{");
        A02("mTitle", this.A1I, sb);
        A02("mMessage", this.A0r, sb);
        A02("mSubtext", this.A1D, sb);
        A02("mTickerText", this.A1H, sb);
        A02("mIgAction", this.A0g, sb);
        ImageUrl imageUrl = this.A0D;
        String str5 = "";
        if (imageUrl == null) {
            str = "";
        } else {
            str = imageUrl.getUrl();
        }
        A02("mOptionalImage", str, sb);
        ImageUrl imageUrl2 = this.A0C;
        if (imageUrl2 == null) {
            str2 = "";
        } else {
            str2 = imageUrl2.getUrl();
        }
        A02("OptionalAvatarUrl", str2, sb);
        ImageUrl imageUrl3 = this.A0E;
        if (imageUrl3 != null) {
            str5 = imageUrl3.getUrl();
        }
        A02("OptionalMediaUrl", str5, sb);
        A02("mCollapseKey", this.A0X, sb);
        A02("mSound", this.A1C, sb);
        A02("mPushId", this.A12, sb);
        A02("mPushCategory", this.A11, sb);
        A02("mPushTraceId", this.A13, sb);
        A02("mIntendedRecipientUserid", this.A0j, sb);
        try {
            A02("mBadgeCount", AbstractC116175Nw.A00(this.A08), sb);
        } catch (IOException | NullPointerException unused) {
        }
        A02("mInAppActors", this.A0h, sb);
        A02("mHigherPriorityApps", String.valueOf(this.A1K), sb);
        A02("mMessageClientContext", this.A0s, sb);
        A02("mId", this.A0f, sb);
        A02("mRevokedId", this.A16, sb);
        A02("mRtcMessage", this.A17, sb);
        A02("mRtcZippedMessage", this.A18, sb);
        A02("mSenderUserId", this.A1A, sb);
        A02("mSenderName", this.A19, sb);
        A02("mIsShhModeMessage", String.valueOf(this.A1U), sb);
        A02("mLoginNotificationLatitude", this.A0l, sb);
        A02("mLoginNotificationLongitude", this.A0n, sb);
        A02("mLoginNotificationLocationName", this.A0m, sb);
        A02("mLoginNotificationDeviceName", this.A0k, sb);
        A02("mLoginNotificationRequestDeviceId", this.A0o, sb);
        A02("mLoginNotificationTimestamp", this.A0p, sb);
        A02("mLoginNotificationTimestamp", this.A0q, sb);
        A02("mIsCloseFriendsThread", String.valueOf(this.A0G), sb);
        A02("mPushChannelType", this.A0B.A01, sb);
        A02("mGroupId", this.A0d, sb);
        A02("mArmadilloMessageTypeId", this.A0O, sb);
        A02("mArmadilloMessageType", this.A0N, sb);
        A02("mArmadilloPayload", this.A0P, sb);
        A02("mArmadilloWAPushId", this.A0U, sb);
        A02("mArmadilloSenderName", this.A0S, sb);
        A02("mArmadilloSenderImageUrl", this.A0R, sb);
        A02("mArmadilloGroupName", this.A0M, sb);
        A02("mArmadilloReceiverName", this.A0Q, sb);
        A02("mArmadilloThreadKey", this.A0T, sb);
        A02("mArmadilloIsThreadMuted", String.valueOf(this.A1Q), sb);
        A02("mArmadilloIsThreadHidden", String.valueOf(this.A1P), sb);
        A02("mArmadilloIsForegroundAccount", String.valueOf(this.A1O), sb);
        A02("mIsInstamadillo", String.valueOf(this.A1S), sb);
        A02("mInstamadilloThreadType", this.A0i, sb);
        A02("mThreadId", this.A1F, sb);
        A02("mThreadIgId", this.A1G, sb);
        A02("mThreadFbId", this.A1E, sb);
        A02("mNotificationTraceId", this.A0z, sb);
        A02("mMessageTraceId", this.A0v, sb);
        A02("mMiTraceId", this.A0x, sb);
        A02("mExperimentsMask", this.A0c, sb);
        A02("mDirectThreadPropertiesMask", this.A0a, sb);
        A02("mDirectThreadTitle", this.A0b, sb);
        A02("mDirectReplyMessage", this.A0Z, sb);
        A02("mIsE2EEBadgeCountCalculated", String.valueOf(this.A1R), sb);
        A02("mChannelDirectInvitesJoinLink", this.A0W, sb);
        A02("mChannelDirectInvitesInviteId", this.A0V, sb);
        Integer num = this.A0I;
        String str6 = null;
        if (num != null) {
            str3 = num.toString();
        } else {
            str3 = null;
        }
        A02("mPushPriority", str3, sb);
        Integer num2 = this.A0H;
        if (num2 != null) {
            str4 = num2.toString();
        } else {
            str4 = null;
        }
        A02("mOriginalPushPriority", str4, sb);
        A02("mContentHash", this.A0Y, sb);
        A02("mServerSendTime", String.valueOf(this.A00), sb);
        A02("mContentDedupLookbackWindow", String.valueOf(this.A01), sb);
        A02("mLockedStatus", String.valueOf(this.A02), sb);
        try {
            C5f9 c5f9 = this.A0A;
            if (c5f9 != null) {
                StringWriter stringWriter = new StringWriter();
                C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                C5f8.A00(A0A, c5f9);
                A0A.close();
                str6 = stringWriter.toString();
            }
            A02("mPushInfraMetadata", str6, sb);
        } catch (IOException unused2) {
        }
        sb.append('}');
        return sb.toString();
    }

    public static C116155Nu A01(String str, String str2) {
        C116155Nu parseFromJson = AbstractC116165Nv.parseFromJson(C16V.A00(str));
        if (parseFromJson == null) {
            return null;
        }
        parseFromJson.A1V = str2;
        return parseFromJson;
    }

    public static void A02(String str, String str2, StringBuilder sb) {
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '\'') {
            sb.append(", ");
        }
        sb.append(str);
        sb.append("='");
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        sb.append('\'');
    }

    public C116155Nu() {
        this.A1O = true;
        this.A03 = System.currentTimeMillis();
        this.A1N = false;
        this.A14 = null;
        this.A0B = PushChannelType.A0D;
        this.A07 = EnumC47122Ee.A0c;
        this.A00 = -1.0f;
        this.A01 = 0;
        this.A02 = 0;
        this.A0Z = null;
        this.A1T = false;
        this.A1L = null;
        this.A1M = false;
        this.A0K = 0L;
        this.A05 = null;
    }
}

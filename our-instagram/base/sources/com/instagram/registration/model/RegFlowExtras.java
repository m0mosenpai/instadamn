package com.instagram.registration.model;

import X.AbstractC111324zv;
import X.AbstractC12990ll;
import X.AbstractC13670mt;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.AbstractC31172DnG;
import X.AbstractC31193Dnc;
import X.C05F;
import X.C16030qx;
import X.C17z;
import X.C25621Ms;
import X.C34517FJd;
import X.C34705FQq;
import X.C34706FQr;
import X.C37324GcR;
import X.EnumC33445EqI;
import X.W4M;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import com.instagram.phonenumber.model.CountryCodeData;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class RegFlowExtras implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C37324GcR(38);
    public long A00;
    public CountryCodeData A01;
    public C34706FQr A02;
    public UserBirthDate A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
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
    public List A0e;
    public List A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public boolean A0u = false;
    public boolean A0m = false;

    public final EnumC33445EqI A01() {
        try {
            String str = this.A0S;
            if (str != null) {
                return EnumC33445EqI.valueOf(str);
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final Integer A02() {
        try {
            String str = this.A0V;
            if (str != null) {
                if (str.equals(PaymentDetailChangeTypes$Companion.EMAIL)) {
                    return C05F.A00;
                }
                if (str.equals("PHONE_REG")) {
                    return C05F.A01;
                }
                if (str.equals("MAIN_ACCOUNT")) {
                    return C05F.A0C;
                }
                if (str.equals("SIMPLE_SAC")) {
                    return C05F.A0N;
                }
                if (str.equals("ADD_PHONE")) {
                    return C05F.A0Y;
                }
                if (str.equals("SAC_CAL")) {
                    return C05F.A0j;
                }
                if (str.equals(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED)) {
                    return C05F.A0u;
                }
                throw AbstractC166987dD.A12(str);
            }
        } catch (IllegalArgumentException unused) {
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String[] strArr;
        ArrayList arrayList;
        int i2;
        String str;
        parcel.writeParcelable(this.A01, 0);
        parcel.writeString(this.A0R);
        parcel.writeString(this.A0Q);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0O);
        parcel.writeString(this.A0Z);
        parcel.writeString(this.A0W);
        parcel.writeString(this.A0P);
        parcel.writeString(this.A05);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0X);
        parcel.writeLong(this.A00);
        parcel.writeByte(this.A0n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A10 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0w ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A12 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0s ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0v ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0k ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0u ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A11 ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.A03, 0);
        parcel.writeStringList(this.A0e);
        List list = this.A0f;
        if (list != null) {
            strArr = new String[list.size()];
            for (int i3 = 0; i3 < list.size(); i3++) {
                C34517FJd c34517FJd = (C34517FJd) list.get(i3);
                try {
                    StringWriter stringWriter = new StringWriter();
                    C17z A0S = AbstractC167007dF.A0S(stringWriter);
                    String str2 = c34517FJd.A01;
                    if (str2 != null) {
                        A0S.A0S(AbstractC31193Dnc.A00(), str2);
                    }
                    String str3 = c34517FJd.A00;
                    if (str3 != null) {
                        A0S.A0S("prototype", str3);
                    }
                    str = AbstractC167017dG.A0l(A0S, stringWriter);
                } catch (IOException unused) {
                    str = null;
                }
                strArr[i3] = str;
            }
        } else {
            strArr = null;
        }
        parcel.writeStringArray(strArr);
        C34706FQr c34706FQr = this.A02;
        if (c34706FQr != null) {
            arrayList = AbstractC166987dD.A1E();
            Iterator it = c34706FQr.A00.iterator();
            while (it.hasNext()) {
                arrayList.add(((C34705FQq) it.next()).A00);
            }
            i2 = arrayList.size();
        } else {
            arrayList = null;
            i2 = -1;
        }
        parcel.writeInt(i2);
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = arrayList.get(i4);
            obj.getClass();
            parcel.writeList((List) obj);
        }
        parcel.writeString(this.A0S);
        parcel.writeString(this.A0N);
        parcel.writeString(this.A0V);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeByte(this.A0l ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0x ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A0Y);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A04);
        parcel.writeString(this.A0T);
        parcel.writeString(this.A0U);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0M);
        parcel.writeString(this.A09);
        parcel.writeByte(this.A0r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0m ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A0b);
        parcel.writeString(this.A0d);
        parcel.writeString(this.A0c);
        parcel.writeString(this.A0a);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0G);
        parcel.writeByte(this.A0t ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0y ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0I);
        parcel.writeByte(this.A0z ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0i ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0F);
        parcel.writeByte(this.A0o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0p ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0j ? (byte) 1 : (byte) 0);
    }

    public static void A00(Context context, C25621Ms c25621Ms, AbstractC12990ll abstractC12990ll, RegFlowExtras regFlowExtras, boolean z) {
        String str;
        context.getClass();
        if (!TextUtils.isEmpty(regFlowExtras.A08)) {
            String str2 = regFlowExtras.A08;
            Pattern pattern = AbstractC13670mt.A01;
            if (str2 == null) {
                str2 = "";
            }
            c25621Ms.A9s("email", str2);
        }
        String str3 = regFlowExtras.A0Z;
        Pattern pattern2 = AbstractC13670mt.A01;
        if (str3 == null) {
            str3 = "";
        }
        c25621Ms.A9s(AbstractC31193Dnc.A00(), str3);
        String str4 = regFlowExtras.A0W;
        if (str4 == null) {
            str4 = "";
        }
        c25621Ms.A9s("suggestedUsername", str4);
        if (!regFlowExtras.A11) {
            W4M w4m = new W4M(abstractC12990ll);
            String str5 = regFlowExtras.A0P;
            if (str5 == null) {
                str5 = "";
            }
            c25621Ms.A9s("enc_password", w4m.A00(str5));
        }
        if (!TextUtils.isEmpty(regFlowExtras.A0Q)) {
            String str6 = regFlowExtras.A0Q;
            if (str6 == null) {
                str6 = "";
            }
            c25621Ms.A9s(AbstractC31193Dnc.A01(9, 12, 4), str6);
        }
        String A00 = C16030qx.A00(context);
        if (A00 == null) {
            A00 = "";
        }
        c25621Ms.A9s(AbstractC31193Dnc.A01(0, 9, 51), A00);
        String A10 = AbstractC31172DnG.A10(context);
        if (A10 == null) {
            A10 = "";
        }
        c25621Ms.A9s("guid", A10);
        boolean z2 = regFlowExtras.A0i;
        String str7 = regFlowExtras.A0O;
        if (str7 == null) {
            str7 = "";
        }
        if (z2) {
            str = "group_full_name";
        } else {
            str = "first_name";
        }
        c25621Ms.A9s(str, str7);
        String str8 = regFlowExtras.A0B;
        if (str8 == null) {
            str8 = "";
        }
        c25621Ms.A9s("force_sign_up_code", str8);
        if (!TextUtils.isEmpty(regFlowExtras.A05)) {
            String str9 = regFlowExtras.A05;
            if (str9 == null) {
                str9 = "";
            }
            c25621Ms.A9s(AbstractC31193Dnc.A01(39, 17, 105), str9);
        }
        if (regFlowExtras.A10) {
            c25621Ms.A9s("skip_email", "true");
        }
        if (regFlowExtras.A0h) {
            c25621Ms.A9s("allow_contacts_sync", "true");
        }
        if (regFlowExtras.A0q) {
            c25621Ms.A9s("has_sms_consent", "true");
        }
        if (regFlowExtras.A0l) {
            c25621Ms.A9s("force_create_account", "true");
        }
        if (regFlowExtras.A0x) {
            c25621Ms.A9s("requested_username_change", "true");
        }
        if (regFlowExtras.A0w) {
            c25621Ms.A9s("one_tap_opt_in", "true");
        }
        if (regFlowExtras.A11) {
            c25621Ms.A9s("skip_password_setup", "true");
        }
        if (!TextUtils.isEmpty(regFlowExtras.A0C)) {
            c25621Ms.A9s("gdpr_s", regFlowExtras.A0C);
        }
        if (!TextUtils.isEmpty(regFlowExtras.A0D)) {
            c25621Ms.A9s("id_token", regFlowExtras.A0D);
        }
        if (!TextUtils.isEmpty(regFlowExtras.A0X)) {
            c25621Ms.A9s("tos_version", regFlowExtras.A0X);
        }
        C34706FQr c34706FQr = regFlowExtras.A02;
        if (c34706FQr != null) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = c34706FQr.A00.iterator();
            while (it.hasNext()) {
                A1E.add(((C34705FQq) it.next()).A00);
            }
            Iterator it2 = A1E.iterator();
            while (it2.hasNext()) {
                Iterator A1J = AbstractC25226BEj.A1J(it2.next());
                while (A1J.hasNext()) {
                    A1C.append(A1J.next().toString());
                    A1C.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                }
                if (A1C.length() > 0) {
                    A1C.deleteCharAt(A1C.length() - 1);
                }
                A1C.append("|");
            }
            if (A1C.length() > 0) {
                A1C.deleteCharAt(A1C.length() - 1);
            }
            c25621Ms.A9s("qs_stamp", A1C.toString());
        }
        if (regFlowExtras.A0z) {
            c25621Ms.A9s("should_link_to_main", "true");
        }
        if (regFlowExtras.A0i) {
            c25621Ms.A9s("convert_to_group", "true");
            String str10 = regFlowExtras.A0E;
            if (str10 != null) {
                c25621Ms.A9s("group_biography", str10);
            }
            String str11 = regFlowExtras.A0F;
            if (str11 != null) {
                c25621Ms.A9s("group_external_url", str11);
            }
            if (regFlowExtras.A0o) {
                c25621Ms.A9s("group_should_be_private", "true");
            }
            if (regFlowExtras.A0p) {
                c25621Ms.A9s(AbstractC111324zv.A00(117), "true");
            }
            if (regFlowExtras.A0j) {
                c25621Ms.A9s("create_group_thread", "true");
            }
        }
        String str12 = regFlowExtras.A07;
        if (str12 != null) {
            c25621Ms.A9s("sn_result", str12);
        }
        String str13 = regFlowExtras.A06;
        if (str13 != null) {
            c25621Ms.A9s("sn_nonce", str13);
        }
        if (z) {
            c25621Ms.A0M("profile_pic");
        }
    }

    public final void A03(EnumC33445EqI enumC33445EqI) {
        this.A0S = enumC33445EqI.name();
    }
}

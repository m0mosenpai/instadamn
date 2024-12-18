package X;

import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.msys.cql.dataclasses.ReadOnlyMessageMetadataDataclassAdapter;
import com.facebook.msys.cql.dataclasses.XmaDataclassAdapter;
import com.facebook.msys.mci.AuthData;
import com.facebook.tigon.tigonhuc.HucClient;
import java.util.List;
import java.util.Map;

/* renamed from: X.LpK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49203LpK implements InterfaceC50520MRx {
    public final K4D A00;
    public final AuthData A01;
    public final Map A02;

    public C49203LpK(K4D k4d, AuthData authData, Map map) {
        C14360o3.A0B(authData, 3);
        this.A00 = k4d;
        this.A02 = map;
        this.A01 = authData;
    }

    @Override // X.InterfaceC50520MRx
    public final L3Z Ad2(int i) {
        return null;
    }

    @Override // X.InterfaceC50520MRx
    public final boolean CZm(int i) {
        return false;
    }

    @Override // X.InterfaceC50520MRx
    public final String Ad1(int i) {
        return this.A00.mResultSet.getString(i, 30);
    }

    @Override // X.InterfaceC50520MRx
    public final String Ad3(int i) {
        return this.A00.mResultSet.getString(i, 31);
    }

    @Override // X.InterfaceC50520MRx
    public final Long Ad4(int i) {
        return this.A00.mResultSet.getNullableLong(i, 29);
    }

    @Override // X.InterfaceC50520MRx
    public final String Ad5(int i) {
        return this.A00.mResultSet.getString(i, 37);
    }

    @Override // X.InterfaceC50520MRx
    public final Integer Ad6(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 28);
    }

    @Override // X.InterfaceC50520MRx
    public final int B0J(int i) {
        return this.A00.mResultSet.getInteger(i, 109);
    }

    @Override // X.InterfaceC50520MRx
    public final String BDC(int i) {
        return this.A00.mResultSet.getString(i, 40);
    }

    @Override // X.InterfaceC50520MRx
    public final int BJC(int i) {
        return AbstractC167017dG.A0K(this.A00.mResultSet.getNullableInteger(i, 35));
    }

    @Override // X.InterfaceC50520MRx
    public final Long BOG(int i) {
        return this.A00.mResultSet.getNullableLong(i, 13);
    }

    @Override // X.InterfaceC50520MRx
    public final int BSk(int i) {
        return this.A00.mResultSet.getInteger(i, 9);
    }

    @Override // X.InterfaceC50520MRx
    public final int BSl(int i) {
        return this.A00.mResultSet.getInteger(i, 8);
    }

    @Override // X.InterfaceC50520MRx
    public final Integer BSq(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 10);
    }

    @Override // X.InterfaceC50520MRx
    public final Long BSr(int i) {
        return this.A00.mResultSet.getNullableLong(i, 112);
    }

    @Override // X.InterfaceC50520MRx
    public final String BSx(int i) {
        String string = this.A00.mResultSet.getString(i, 1);
        C14360o3.A07(string);
        return string;
    }

    @Override // X.InterfaceC50520MRx
    public final List BXY(int i) {
        K4D k4d = this.A00;
        return AbstractC16960so.A1M(k4d.mResultSet.getString(i, 44), k4d.mResultSet.getString(i, 45), k4d.mResultSet.getString(i, 46), k4d.mResultSet.getString(i, 47), k4d.mResultSet.getString(i, 48));
    }

    @Override // X.InterfaceC50520MRx
    public final String BYZ(int i) {
        String string = this.A00.mResultSet.getString(i, 2);
        if (string == null) {
            return "0";
        }
        return string;
    }

    @Override // X.InterfaceC50520MRx
    public final Long Bdo(int i) {
        return this.A00.mResultSet.getNullableLong(i, 34);
    }

    @Override // X.InterfaceC50520MRx
    public final Long BeK(int i) {
        return this.A00.mResultSet.getNullableLong(i, 146);
    }

    @Override // X.InterfaceC50520MRx
    public final String BeN(int i) {
        return this.A00.mResultSet.getString(i, 147);
    }

    @Override // X.InterfaceC50520MRx
    public final String BfK(int i) {
        return this.A00.mResultSet.getString(i, 141);
    }

    @Override // X.InterfaceC50520MRx
    public final Integer Bfp(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 39);
    }

    @Override // X.InterfaceC50520MRx
    public final Integer Bg0(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 38);
    }

    @Override // X.InterfaceC50520MRx
    public final C47384KwZ Bkg(int i) {
        return (C47384KwZ) this.A02.get(BSx(i));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.facebook.msys.cql.dataclasses.ReadOnlyMessageMetadataDataclassAdapter, X.LA0] */
    @Override // X.InterfaceC50520MRx
    public final MS0 Bkq(int i) {
        K4D k4d = this.A00;
        ReadOnlyMessageMetadataDataclassAdapter readOnlyMessageMetadataDataclassAdapter = k4d.A00;
        ReadOnlyMessageMetadataDataclassAdapter readOnlyMessageMetadataDataclassAdapter2 = readOnlyMessageMetadataDataclassAdapter;
        if (readOnlyMessageMetadataDataclassAdapter == null) {
            ?? la0 = new LA0();
            k4d.A00 = la0;
            readOnlyMessageMetadataDataclassAdapter2 = la0;
        }
        return (MS0) readOnlyMessageMetadataDataclassAdapter2.getNullableAdaptedObject(i, new GRQ(k4d, i, 0));
    }

    @Override // X.InterfaceC50520MRx
    public final Long Bn3(int i) {
        return this.A00.mResultSet.getNullableLong(i, 65);
    }

    @Override // X.InterfaceC50520MRx
    public final Integer Bn4(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 105);
    }

    @Override // X.InterfaceC50520MRx
    public final Integer Bn5(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 104);
    }

    @Override // X.InterfaceC50520MRx
    public final Integer Bn6(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 64);
    }

    @Override // X.InterfaceC50520MRx
    public final String Bn8(int i) {
        return this.A00.mResultSet.getString(i, 66);
    }

    @Override // X.InterfaceC50520MRx
    public final String BnE(int i) {
        return this.A00.mResultSet.getString(i, 73);
    }

    @Override // X.InterfaceC50520MRx
    public final Integer BnH(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 57);
    }

    @Override // X.InterfaceC50520MRx
    public final Integer BnI(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 108);
    }

    @Override // X.InterfaceC50520MRx
    public final Long BnJ(int i) {
        return this.A00.mResultSet.getNullableLong(i, 52);
    }

    @Override // X.InterfaceC50520MRx
    public final String BnK(int i) {
        return this.A00.mResultSet.getString(i, 55);
    }

    @Override // X.InterfaceC50520MRx
    public final Long BnM(int i) {
        return this.A00.mResultSet.getNullableLong(i, 70);
    }

    @Override // X.InterfaceC50520MRx
    public final String BnN(int i) {
        return this.A00.mResultSet.getString(i, 103);
    }

    @Override // X.InterfaceC50520MRx
    public final Long BnP(int i) {
        return this.A00.mResultSet.getNullableLong(i, 61);
    }

    @Override // X.InterfaceC50520MRx
    public final String BnQ(int i) {
        return this.A00.mResultSet.getString(i, 59);
    }

    @Override // X.InterfaceC50520MRx
    public final Integer BnU(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 84);
    }

    @Override // X.InterfaceC50520MRx
    public final String BnV(int i) {
        return this.A00.mResultSet.getString(i, 101);
    }

    @Override // X.InterfaceC50520MRx
    public final Integer BnW(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 97);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.facebook.msys.cql.dataclasses.XmaDataclassAdapter, X.LA0] */
    @Override // X.InterfaceC50520MRx
    public final MS1 BnX(int i) {
        K4D k4d = this.A00;
        XmaDataclassAdapter xmaDataclassAdapter = k4d.A01;
        XmaDataclassAdapter xmaDataclassAdapter2 = xmaDataclassAdapter;
        if (xmaDataclassAdapter == null) {
            ?? la0 = new LA0();
            k4d.A01 = la0;
            xmaDataclassAdapter2 = la0;
        }
        return (MS1) xmaDataclassAdapter2.getNullableAdaptedObject(i, new GRQ(k4d, i, 1));
    }

    @Override // X.InterfaceC50520MRx
    public final String BnY(int i) {
        return this.A00.mResultSet.getString(i, 83);
    }

    @Override // X.InterfaceC50520MRx
    public final String BnZ(int i) {
        return this.A00.mResultSet.getString(i, 93);
    }

    @Override // X.InterfaceC50520MRx
    public final String Bna(int i) {
        return this.A00.mResultSet.getString(i, 92);
    }

    @Override // X.InterfaceC50520MRx
    public final Integer Bnb(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 91);
    }

    @Override // X.InterfaceC50520MRx
    public final String Bnc(int i) {
        return this.A00.mResultSet.getString(i, 85);
    }

    @Override // X.InterfaceC50520MRx
    public final boolean Bnd(int i) {
        return this.A00.mResultSet.getBoolean(i, 94);
    }

    @Override // X.InterfaceC50520MRx
    public final Integer Bne(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 79);
    }

    @Override // X.InterfaceC50520MRx
    public final Integer Bnf(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 90);
    }

    @Override // X.InterfaceC50520MRx
    public final Integer Bng(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 89);
    }

    @Override // X.InterfaceC50520MRx
    public final String Bnh(int i) {
        return this.A00.mResultSet.getString(i, 88);
    }

    @Override // X.InterfaceC50520MRx
    public final String Bni(int i) {
        return this.A00.mResultSet.getString(i, 82);
    }

    @Override // X.InterfaceC50520MRx
    public final String Bnj(int i) {
        return this.A00.mResultSet.getString(i, 87);
    }

    @Override // X.InterfaceC50520MRx
    public final String Bnk(int i) {
        return this.A00.mResultSet.getString(i, 95);
    }

    @Override // X.InterfaceC50520MRx
    public final int BtB(int i) {
        return this.A00.mResultSet.getInteger(i, 11);
    }

    @Override // X.InterfaceC50520MRx
    public final long BtD(int i) {
        return this.A00.mResultSet.getLong(i, 16);
    }

    @Override // X.InterfaceC50520MRx
    public final String BtG(int i) {
        String string = this.A00.mResultSet.getString(i, 26);
        if (string == null) {
            return "";
        }
        return string;
    }

    @Override // X.InterfaceC50520MRx
    public final String BtI(int i) {
        String string = this.A00.mResultSet.getString(i, 17);
        if (string == null) {
            return "";
        }
        return string;
    }

    @Override // X.InterfaceC50520MRx
    public final String BtK(int i) {
        Long l;
        AuthData authData = this.A01;
        K4D k4d = this.A00;
        String string = k4d.mResultSet.getString(i, 19);
        String string2 = k4d.mResultSet.getString(i, 20);
        Long nullableLong = k4d.mResultSet.getNullableLong(i, 21);
        if (nullableLong != null) {
            l = AbstractC43594JPz.A0q(nullableLong);
        } else {
            l = null;
        }
        String A00 = AbstractC34134F4k.A00(authData, l, string, string2);
        if (A00 == null) {
            return "";
        }
        return A00;
    }

    @Override // X.InterfaceC50520MRx
    public final String C5u(int i) {
        return this.A00.mResultSet.getString(i, 7);
    }

    @Override // X.InterfaceC50520MRx
    public final long C7P(int i) {
        return this.A00.mResultSet.getLong(i, 0);
    }

    @Override // X.InterfaceC50520MRx
    public final long C8h(int i) {
        return this.A00.mResultSet.getLong(i, 3);
    }

    @Override // X.InterfaceC50520MRx
    public final boolean CGp(int i) {
        return this.A00.mResultSet.getBoolean(i, 49);
    }

    @Override // X.InterfaceC50520MRx
    public final Integer CGq(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 50);
    }

    @Override // X.InterfaceC50520MRx
    public final Integer CGr(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 51);
    }

    @Override // X.InterfaceC50520MRx
    public final Integer CIA(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 123);
    }

    @Override // X.InterfaceC50520MRx
    public final String CIB(int i) {
        return this.A00.mResultSet.getString(i, 139);
    }

    @Override // X.InterfaceC50520MRx
    public final Integer CID(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 115);
    }

    @Override // X.InterfaceC50520MRx
    public final String CIE(int i) {
        return this.A00.mResultSet.getString(i, 121);
    }

    @Override // X.InterfaceC50520MRx
    public final String CIF(int i) {
        return this.A00.mResultSet.getString(i, 122);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.facebook.msys.cql.dataclasses.XmaDataclassAdapter, X.LA0] */
    @Override // X.InterfaceC50520MRx
    public final MS1 CIG(int i) {
        K4D k4d = this.A00;
        XmaDataclassAdapter xmaDataclassAdapter = k4d.A02;
        XmaDataclassAdapter xmaDataclassAdapter2 = xmaDataclassAdapter;
        if (xmaDataclassAdapter == null) {
            ?? la0 = new LA0();
            k4d.A02 = la0;
            xmaDataclassAdapter2 = la0;
        }
        return (MS1) xmaDataclassAdapter2.getNullableAdaptedObject(i, new GRQ(k4d, i, 2));
    }

    @Override // X.InterfaceC50520MRx
    public final String CIH(int i) {
        return this.A00.mResultSet.getString(i, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS);
    }

    @Override // X.InterfaceC50520MRx
    public final String CII(int i) {
        return this.A00.mResultSet.getString(i, 132);
    }

    @Override // X.InterfaceC50520MRx
    public final String CIJ(int i) {
        return this.A00.mResultSet.getString(i, 131);
    }

    @Override // X.InterfaceC50520MRx
    public final Integer CIK(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 130);
    }

    @Override // X.InterfaceC50520MRx
    public final String CIL(int i) {
        return this.A00.mResultSet.getString(i, 124);
    }

    @Override // X.InterfaceC50520MRx
    public final boolean CIM(int i) {
        return this.A00.mResultSet.getBoolean(i, 133);
    }

    @Override // X.InterfaceC50520MRx
    public final Integer CIN(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 116);
    }

    @Override // X.InterfaceC50520MRx
    public final Integer CIO(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 129);
    }

    @Override // X.InterfaceC50520MRx
    public final Integer CIP(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 128);
    }

    @Override // X.InterfaceC50520MRx
    public final String CIQ(int i) {
        return this.A00.mResultSet.getString(i, StringTreeSet.MAX_SYMBOL_COUNT);
    }

    @Override // X.InterfaceC50520MRx
    public final String CIR(int i) {
        return this.A00.mResultSet.getString(i, 119);
    }

    @Override // X.InterfaceC50520MRx
    public final String CIS(int i) {
        return this.A00.mResultSet.getString(i, 126);
    }

    @Override // X.InterfaceC50520MRx
    public final String CIT(int i) {
        return this.A00.mResultSet.getString(i, 135);
    }

    @Override // X.InterfaceC50520MRx
    public final String CIU(int i) {
        return this.A00.mResultSet.getString(i, 134);
    }

    @Override // X.InterfaceC50520MRx
    public final boolean CV7(int i) {
        return this.A00.mResultSet.getBoolean(i, 12);
    }

    @Override // X.InterfaceC50520MRx
    public final boolean Ccr(int i) {
        String string = this.A00.mResultSet.getString(i, 145);
        if (string == null) {
            return false;
        }
        return AbstractC001900j.A0a(string, "2", false);
    }

    @Override // X.InterfaceC50520MRx
    public final boolean CgD(int i) {
        return this.A00.mResultSet.getBoolean(i, 136);
    }

    @Override // X.InterfaceC50520MRx
    public final boolean CgE(int i) {
        return this.A00.mResultSet.getBoolean(i, 137);
    }

    @Override // X.InterfaceC50520MRx
    public final int getCount() {
        return AbstractC43592JPx.A02(this.A00);
    }

    @Override // X.InterfaceC50520MRx
    public final int BTA(int i) {
        return "typing_indicator".equals(BSx(i)) ? 1 : 0;
    }
}

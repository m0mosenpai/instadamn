package X;

import com.instagram.direct.model.messaginguser.MessagingUser;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.MRx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC50520MRx {
    String Ad1(int i);

    L3Z Ad2(int i);

    String Ad3(int i);

    Long Ad4(int i);

    String Ad5(int i);

    Integer Ad6(int i);

    int B0J(int i);

    String BDC(int i);

    int BJC(int i);

    Long BOG(int i);

    int BSk(int i);

    int BSl(int i);

    Integer BSq(int i);

    Long BSr(int i);

    String BSx(int i);

    int BTA(int i);

    List BXY(int i);

    String BYZ(int i);

    Long Bdo(int i);

    Long BeK(int i);

    String BeN(int i);

    String BfK(int i);

    Integer Bfp(int i);

    Integer Bg0(int i);

    C47384KwZ Bkg(int i);

    MS0 Bkq(int i);

    Long Bn3(int i);

    Integer Bn4(int i);

    Integer Bn5(int i);

    Integer Bn6(int i);

    String Bn8(int i);

    String BnE(int i);

    Integer BnH(int i);

    Integer BnI(int i);

    Long BnJ(int i);

    String BnK(int i);

    Long BnM(int i);

    String BnN(int i);

    Long BnP(int i);

    String BnQ(int i);

    Integer BnU(int i);

    String BnV(int i);

    Integer BnW(int i);

    MS1 BnX(int i);

    String BnY(int i);

    String BnZ(int i);

    String Bna(int i);

    Integer Bnb(int i);

    String Bnc(int i);

    boolean Bnd(int i);

    Integer Bne(int i);

    Integer Bnf(int i);

    Integer Bng(int i);

    String Bnh(int i);

    String Bni(int i);

    String Bnj(int i);

    String Bnk(int i);

    int BtB(int i);

    long BtD(int i);

    String BtG(int i);

    String BtI(int i);

    String BtK(int i);

    String C5u(int i);

    long C7P(int i);

    long C8h(int i);

    boolean CGp(int i);

    Integer CGq(int i);

    Integer CGr(int i);

    Integer CIA(int i);

    String CIB(int i);

    Integer CID(int i);

    String CIE(int i);

    String CIF(int i);

    MS1 CIG(int i);

    String CIH(int i);

    String CII(int i);

    String CIJ(int i);

    Integer CIK(int i);

    String CIL(int i);

    boolean CIM(int i);

    Integer CIN(int i);

    Integer CIO(int i);

    Integer CIP(int i);

    String CIQ(int i);

    String CIR(int i);

    String CIS(int i);

    String CIT(int i);

    String CIU(int i);

    boolean CV7(int i);

    boolean CZm(int i);

    boolean Ccr(int i);

    boolean CgD(int i);

    boolean CgE(int i);

    int getCount();

    static long A00(InterfaceC50520MRx interfaceC50520MRx, int i) {
        return TimeUnit.MILLISECONDS.toMicros(interfaceC50520MRx.C8h(i));
    }

    static String A01(C99E c99e, InterfaceC50520MRx interfaceC50520MRx, int i) {
        String C5u = interfaceC50520MRx.C5u(i);
        if (C5u == null) {
            return "";
        }
        if (c99e == null) {
            return C5u;
        }
        String ANm = c99e.ANm(C5u);
        C14360o3.A0A(ANm);
        return ANm;
    }

    static boolean A02(MessagingUser messagingUser, InterfaceC50520MRx interfaceC50520MRx, int i) {
        return messagingUser.A01(interfaceC50520MRx.BtD(i));
    }
}

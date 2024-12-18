package X;

import java.security.GeneralSecurityException;

/* renamed from: X.SdM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63118SdM {
    public static final C62500SEc A00;
    public static final C62501SEd A01;
    public static final C62502SEe A02;
    public static final C62503SEf A03;
    public static final C58526Pwu A04;

    public static RTP A00(C60839RUy format, PxH outputPrefixType) {
        SYD syd;
        SXu sXu;
        RVD rvd = RVD.DEFAULT_INSTANCE;
        RUZ ruz = (RUZ) ((PxQ) rvd.A0F(C05F.A0Y));
        RVD rvd2 = format.dekTemplate_;
        if (rvd2 == null) {
            rvd2 = rvd;
        }
        ruz.A07(rvd2.typeUrl_);
        RVD rvd3 = format.dekTemplate_;
        if (rvd3 == null) {
            rvd3 = rvd;
        }
        ruz.A06(rvd3.value_);
        ruz.A05(PxH.RAW);
        AbstractC61590RqE A002 = SSQ.A00(ruz.A02().A0E());
        if (A002 instanceof C58529Pwx) {
            syd = SYD.A03;
        } else if (A002 instanceof RTK) {
            syd = SYD.A05;
        } else if (A002 instanceof RTL) {
            syd = SYD.A06;
        } else if (A002 instanceof RTQ) {
            syd = SYD.A01;
        } else if (A002 instanceof RTO) {
            syd = SYD.A02;
        } else if (A002 instanceof RTM) {
            syd = SYD.A04;
        } else {
            throw AbstractC58320PtC.A19(A002, "Unsupported DEK parameters when parsing ", AbstractC166987dD.A1C());
        }
        int ordinal = outputPrefixType.ordinal();
        if (ordinal != 1) {
            if (ordinal == 3) {
                sXu = SXu.A01;
            } else {
                throw AbstractC58320PtC.A18(outputPrefixType);
            }
        } else {
            sXu = SXu.A02;
        }
        String str = format.kekUri_;
        RT7 rt7 = (RT7) A002;
        if (str != null) {
            if (rt7 != null) {
                if (!rt7.A00()) {
                    if ((syd.equals(SYD.A03) && (rt7 instanceof C58529Pwx)) || ((syd.equals(SYD.A05) && (rt7 instanceof RTK)) || ((syd.equals(SYD.A06) && (rt7 instanceof RTL)) || ((syd.equals(SYD.A01) && (rt7 instanceof RTQ)) || ((syd.equals(SYD.A02) && (rt7 instanceof RTO)) || (syd.equals(SYD.A04) && (rt7 instanceof RTM))))))) {
                        return new RTP(rt7, syd, sXu, str);
                    }
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append("Cannot use parsing strategy ");
                    AbstractC58318PtA.A1V(A1C, syd);
                    A1C.append(" when new keys are picked according to ");
                    A1C.append(rt7);
                    throw AbstractC58318PtA.A0x(AbstractC166997dE.A0x(".", A1C));
                }
                throw AbstractC58318PtA.A0x("dekParametersForNewKeys must not have ID Requirements");
            }
            throw AbstractC58318PtA.A0x("dekParametersForNewKeys must be set");
        }
        throw AbstractC58318PtA.A0x("kekUri must be set");
    }

    public static C60839RUy A01(RTP parameters) {
        try {
            RVD rvd = (RVD) AbstractC58533Px1.A06(C58534Px2.A00(), RVD.DEFAULT_INSTANCE, SSQ.A01(parameters.A00));
            PxQ pxQ = (PxQ) C60839RUy.DEFAULT_INSTANCE.A0F(C05F.A0Y);
            String str = parameters.A02;
            C60839RUy c60839RUy = (C60839RUy) PxQ.A00(pxQ);
            str.getClass();
            c60839RUy.kekUri_ = str;
            C60839RUy c60839RUy2 = (C60839RUy) PxQ.A00(pxQ);
            rvd.getClass();
            c60839RUy2.dekTemplate_ = rvd;
            c60839RUy2.bitField0_ |= 1;
            return (C60839RUy) pxQ.A02();
        } catch (C61032Re1 e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    static {
        C58526Pwu A012 = AbstractC58538Px6.A01("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        A04 = A012;
        A03 = new C62503SEf(new C58365Pu5(1), RTP.class);
        A02 = C58366Pu6.A00(A012, 1);
        A01 = new C62501SEd(new C58363Pu3(1), RTG.class);
        A00 = C58367Pu7.A00(A012, 1);
    }
}

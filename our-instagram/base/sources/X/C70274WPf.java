package X;

import com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.WPf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70274WPf implements C1N8 {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C70274WPf(Object obj, String str, String str2, String str3, String str4, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A05 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
    }

    @Override // X.C1N8
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C1Dk A00;
        FBPayIGGraphQLQueryExecutor fBPayIGGraphQLQueryExecutor;
        C2n2 c2n2;
        C62731SNv c62731SNv = (C62731SNv) obj;
        switch (this.A00) {
            case 0:
                ((Waq) this.A01).A00.getValue();
                String str = this.A05;
                String str2 = this.A02;
                String str3 = this.A03;
                String str4 = this.A04;
                try {
                    WWJ wwj = (WWJ) AbstractC25234BEr.A0d(C69821Vw7.class);
                    C2JM c2jm = wwj.A00;
                    c2jm.A04("payout_record_id", str4);
                    wwj.A04 = true;
                    c2jm.A04("fe_id", str2);
                    wwj.A02 = true;
                    c2jm.A04(AbstractC63083Sc6.A00(), str);
                    wwj.A05 = true;
                    c2jm.A04("interface_type", "IG_ANDROID");
                    wwj.A03 = true;
                    c2jm.A04("mma_id", str3);
                    A00 = wwj.A00();
                    C14360o3.A07(A00);
                    fBPayIGGraphQLQueryExecutor = C2FP.A06().A00.A01;
                    c2n2 = C70551Wch.A00;
                    break;
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            case 1:
                ((Wav) this.A01).A00.getValue();
                String str5 = this.A05;
                String str6 = this.A02;
                String str7 = this.A03;
                String str8 = this.A04;
                try {
                    WWK wwk = (WWK) AbstractC25234BEr.A0d(C69822Vw8.class);
                    C2JM c2jm2 = wwk.A00;
                    c2jm2.A04("payout_release_id", str8);
                    wwk.A04 = true;
                    c2jm2.A04("fe_id", str6);
                    wwk.A02 = true;
                    c2jm2.A04(AbstractC63083Sc6.A00(), str5);
                    wwk.A05 = true;
                    c2jm2.A04("interface_type", "IG_ANDROID");
                    wwk.A03 = true;
                    c2jm2.A04("mma_id", str7);
                    A00 = wwk.A00();
                    C14360o3.A07(A00);
                    fBPayIGGraphQLQueryExecutor = C2FP.A06().A00.A01;
                    c2n2 = C70555Wcl.A00;
                    break;
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                    throw new RuntimeException(e2);
                }
            default:
                ((Way) this.A01).A00.getValue();
                String str9 = this.A04;
                String str10 = this.A02;
                String str11 = this.A03;
                String str12 = this.A05;
                try {
                    WWI wwi = (WWI) AbstractC25234BEr.A0d(C69824VwA.class);
                    C2JM c2jm3 = wwi.A00;
                    c2jm3.A04("fe_id", str9);
                    wwi.A02 = true;
                    c2jm3.A04("interface_type", "IG_ANDROID");
                    wwi.A03 = true;
                    c2jm3.A04(AbstractC63083Sc6.A00(), str12);
                    wwi.A04 = true;
                    c2jm3.A03("first", 25);
                    c2jm3.A04("after", str10);
                    c2jm3.A04("filter_type", str11);
                    C1Dk A002 = wwi.A00();
                    C14360o3.A07(A002);
                    return C60622REh.A00(c62731SNv, C2FP.A06().A00.A01, A002, C70556Wcm.A00);
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
                    throw new RuntimeException(e3);
                }
        }
        return C60622REh.A00(c62731SNv, fBPayIGGraphQLQueryExecutor, A00, c2n2);
    }
}

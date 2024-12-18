package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes11.dex */
public final class WPd implements C1N8 {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    public WPd(Object obj, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = str2;
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
                String str = this.A02;
                String str2 = this.A03;
                try {
                    WWF wwf = (WWF) AbstractC50523MSb.A0R("create", C69816Vw2.class);
                    C2JM c2jm = wwf.A00;
                    c2jm.A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
                    wwf.A02 = true;
                    c2jm.A04("payoutRecordId", str2);
                    wwf.A03 = true;
                    A00 = wwf.A00();
                    C14360o3.A07(A00);
                    fBPayIGGraphQLQueryExecutor = C2FP.A06().A00.A01;
                    c2n2 = C70550Wcg.A00;
                    break;
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            case 1:
                ((War) this.A01).A00.getValue();
                String str3 = this.A02;
                String str4 = this.A03;
                try {
                    WWG wwg = (WWG) C69817Vw3.class.getMethod("create", new Class[0]).invoke(null, new Object[0]);
                    C2JM c2jm2 = wwg.A00;
                    c2jm2.A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str3);
                    wwg.A02 = true;
                    c2jm2.A04("interface_type", "IG_ANDROID");
                    wwg.A03 = true;
                    c2jm2.A03("first", 10);
                    c2jm2.A04("batch_item_id", str4);
                    A00 = wwg.A00();
                    C14360o3.A07(A00);
                    fBPayIGGraphQLQueryExecutor = C2FP.A06().A00.A01;
                    c2n2 = C70552Wci.A00;
                    break;
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                    throw new RuntimeException(e2);
                }
            default:
                ((Wau) this.A01).A00.getValue();
                String str5 = this.A02;
                String str6 = this.A03;
                try {
                    WWC wwc = (WWC) AbstractC25234BEr.A0d(C69818Vw4.class);
                    C2JM c2jm3 = wwc.A00;
                    c2jm3.A04("interface_type", "IG_ANDROID");
                    wwc.A02 = true;
                    c2jm3.A04("page_id", str5);
                    c2jm3.A04(AbstractC63083Sc6.A00(), str6);
                    return C60622REh.A00(c62731SNv, C2FP.A06().A00.A01, wwc.A00(), C70554Wck.A00);
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
                    throw new RuntimeException(e3);
                }
        }
        return C60622REh.A00(c62731SNv, fBPayIGGraphQLQueryExecutor, A00, c2n2);
    }
}

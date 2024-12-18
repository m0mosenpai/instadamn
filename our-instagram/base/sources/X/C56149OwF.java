package X;

import com.instagram.common.session.UserSession;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* renamed from: X.OwF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56149OwF implements InterfaceC25601Mq {
    public final int A00;
    public final Object A01;

    public C56149OwF(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC25601Mq
    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        C2JS requiredTreeField;
        C65943Two c65943Two;
        switch (this.A00) {
            case 0:
                C3JY c3jy = (C3JY) obj;
                C14360o3.A0B(c3jy, 0);
                InterfaceC26481Qd A00 = c3jy.A00();
                if (A00 != null) {
                    InputStream AjT = A00.AjT();
                    try {
                        byte[] byteArray = new ByteArrayOutputStream().toByteArray();
                        C14360o3.A07(byteArray);
                        NAJ naj = new NAJ(byteArray);
                        naj.mStatusCode = c3jy.A02;
                        AjT.close();
                        return naj;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            C20I.A00(AjT, th);
                            throw th2;
                        }
                    }
                }
                throw new IOException();
            case 1:
                AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
                C14360o3.A0B(anonymousClass435, 0);
                C2JS c2js = (C2JS) anonymousClass435.A01;
                if (c2js != null && (requiredTreeField = c2js.getRequiredTreeField(0, "xdt_user_clips_graphql(data:$data)", C65942Twn.class, 352468645)) != null && (c65943Two = (C65943Two) requiredTreeField.reinterpretRequired(0, C65943Two.class, -2107973840)) != null) {
                    UserSession userSession = ((W56) this.A01).A03;
                    return new YE5(C1DS.A00(userSession), c65943Two.A0E(C1DS.A00(userSession)).A0q());
                }
                throw AbstractC166987dD.A18(AbstractC111324zv.A00(3604));
            case 2:
                AbstractC24481Hr abstractC24481Hr = (AbstractC24481Hr) obj;
                C14360o3.A0B(abstractC24481Hr, 0);
                File file = (File) abstractC24481Hr.A07();
                if (file == null) {
                    return file;
                }
                String absolutePath = file.getAbsolutePath();
                C47Z c47z = (C47Z) this.A01;
                if (c47z == null) {
                    return file;
                }
                c47z.A2k = absolutePath;
                return file;
            case 3:
                C3JY c3jy2 = (C3JY) obj;
                C14360o3.A0B(c3jy2, 0);
                InterfaceC26481Qd A002 = c3jy2.A00();
                if (A002 != null) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(A002.AjT()));
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    AbstractC38581qm.A01(bufferedReader, new DRQ(A1C, 4));
                    NAK nak = new NAK(AbstractC166987dD.A19(A1C));
                    nak.mStatusCode = c3jy2.A02;
                    return nak;
                }
                throw AbstractC166997dE.A0g();
            default:
                C14360o3.A0B(obj, 0);
                ((InterfaceC23621Ds) this.A01).resumeWith(obj);
                return new C40791um();
        }
    }
}

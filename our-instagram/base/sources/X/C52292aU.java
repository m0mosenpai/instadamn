package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2aU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52292aU {
    public static final /* synthetic */ C0YR[] A06 = {new AnonymousClass013(C52292aU.class, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "getName()Ljava/lang/String;", 0), new AnonymousClass013(C52292aU.class, "allocation", "getAllocation()D", 0), new AnonymousClass013(C52292aU.class, "groups", "getGroups()Lcom/instagram/experiments/ExperimentGroups;", 0)};
    public C17240tK A00;
    public final InterfaceC52252aQ A01;
    public final InterfaceC16530ry A02;
    public final InterfaceC16530ry A03;
    public final InterfaceC16530ry A04;
    public final Map A05;

    public C52292aU(InterfaceC52252aQ interfaceC52252aQ) {
        this.A01 = interfaceC52252aQ;
        Class<?> cls = interfaceC52252aQ.getClass();
        Map map = C0YZ.A03;
        C14360o3.A0B(cls, 1);
        this.A04 = new C52302aV(AbstractC13230m9.A01(cls));
        this.A02 = new C52302aV(null);
        if (AbstractC52312aW.A00.get(interfaceC52252aQ) != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("An experiment (named ");
            sb.append(AbstractC52312aW.A00(interfaceC52252aQ).A09);
            sb.append(") has already been defined for contract ");
            sb.append(interfaceC52252aQ);
            throw new IllegalStateException(sb.toString());
        }
        this.A05 = new LinkedHashMap();
        final C9EL c9el = new C9EL(this, 41);
        this.A03 = new InterfaceC16530ry(c9el) { // from class: X.2aY
            public Object A00;
            public final InterfaceC16660sJ A01;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC16530ry, X.InterfaceC16130rD
            public final Object CES(Object obj, C0YR c0yr) {
                C14360o3.A0B(c0yr, 1);
                Object obj2 = this.A00;
                if (obj2 == null) {
                    throw new IllegalStateException(AbstractC002300n.A0d("Validation error: Group setup: @validationError", "@propertyName", ((AbstractC06830Ya) c0yr).name, false));
                }
                AbstractC52412ag abstractC52412ag = (AbstractC52412ag) this.A01.invoke(obj2);
                if (abstractC52412ag instanceof C52402af) {
                    return ((C52402af) abstractC52412ag).A00;
                }
                if (abstractC52412ag instanceof C52422ah) {
                    throw new IllegalStateException(AbstractC002300n.A0d(AbstractC002300n.A0d("Validation error: Group setup: @validationError", "@propertyName", ((AbstractC06830Ya) c0yr).name, false), "@validationError", ((C52422ah) abstractC52412ag).A00, false));
                }
                throw new RuntimeException();
            }

            {
                this.A01 = c9el;
            }

            @Override // X.InterfaceC16530ry
            public final void Egi(Object obj, Object obj2, C0YR c0yr) {
                this.A00 = obj2;
            }
        };
    }

    public final void A02(C52342aZ c52342aZ, Object obj) {
        C14360o3.A0B(c52342aZ, 0);
        this.A05.put(c52342aZ.A00, obj);
    }

    public final void A03(String str) {
        this.A04.Egi(this, str, A06[0]);
    }

    public final void A00(double d) {
        this.A02.Egi(this, Double.valueOf(d), A06[1]);
    }

    public final void A01(Context context) {
        C52432ai c52432ai;
        InterfaceC52252aQ interfaceC52252aQ = this.A01;
        Map map = this.A05;
        AbstractC52412ag A00 = AbstractC52392ae.A00(interfaceC52252aQ, ServerW3CShippingAddressConstants.DEFAULT, map);
        if (!(A00 instanceof C52422ah)) {
            InterfaceC16530ry interfaceC16530ry = this.A04;
            C0YR[] c0yrArr = A06;
            C52462al c52462al = new C52462al((C52452ak) this.A03.CES(this, c0yrArr[2]), this.A00, (String) interfaceC16530ry.CES(this, c0yrArr[0]), map, ((Number) this.A02.CES(this, c0yrArr[1])).doubleValue());
            String str = c52462al.A09;
            String A0R = AnonymousClass001.A0R(str, C16030qx.A02.A04(context));
            long j = 0;
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                byte[] bytes = A0R.getBytes(C15W.A05);
                C14360o3.A07(bytes);
                int length = messageDigest.digest(bytes).length;
                for (int max = Math.max(0, length - 4); max < length; max++) {
                    j = (j << 8) | (r6[max] & 255);
                }
            } catch (NoSuchAlgorithmException unused) {
            }
            c52462al.A00 = (int) (Long.valueOf(j).longValue() % 10000);
            List list = c52462al.A07.A00;
            Iterator it = list.iterator();
            int i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                i += (int) (10000.0d * c52462al.A06 * ((C52432ai) it.next()).A00);
                if (c52462al.A00 >= i) {
                    i2++;
                }
            }
            if (i <= 10000) {
                c52462al.A01 = i;
                c52462al.A05 = new C52432ai("Deploy: Not in Experiment", c52462al.A0A, (10000 - i) / 10000.0d);
                C19700xy c19700xy = C17280tP.A4E;
                Context applicationContext = context.getApplicationContext();
                C14360o3.A07(applicationContext);
                c52462al.A03 = new C52482an(c19700xy.A01(applicationContext));
                if (i2 < list.size()) {
                    c52432ai = (C52432ai) list.get(i2);
                } else {
                    c52432ai = c52462al.A05;
                    if (c52432ai == null) {
                        C14360o3.A0F("deployGroup");
                        throw C00O.createAndThrow();
                    }
                }
                c52462al.A04 = c52432ai;
                Map map2 = AbstractC52312aW.A00;
                if (map2.get(interfaceC52252aQ) != null) {
                    throw new IllegalStateException("Only one experiment can be registered per contract");
                }
                Map map3 = AbstractC52312aW.A01;
                if (map3.get(str) != null) {
                    throw new IllegalStateException(AnonymousClass001.A0R("An experiment is already registered under the name ", str));
                }
                map2.put(interfaceC52252aQ, c52462al);
                map3.put(str, c52462al);
                return;
            }
            throw new IllegalArgumentException("Total group size exceeds number of segments.");
        }
        throw new IllegalStateException(A00.toString());
    }

    public final void A04(InterfaceC16660sJ interfaceC16660sJ) {
        C52362ab c52362ab = new C52362ab(this.A01, this.A05);
        interfaceC16660sJ.invoke(c52362ab);
        this.A03.Egi(this, new C52452ak(c52362ab.A01), A06[2]);
    }
}

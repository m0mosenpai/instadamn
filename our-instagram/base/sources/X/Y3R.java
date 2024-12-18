package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.hyperthrift.HyperThriftBase;
import com.facebook.systrace.SystraceMessage;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes12.dex */
public final class Y3R {
    public final SL7 A00;
    public final AbstractC95034Pm A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.4Pn, java.lang.Object] */
    public static void A00(HyperThriftBase hyperThriftBase, Y3R y3r, String str) {
        SystraceMessage.A00(SystraceMessage.A00, "HyperThriftWriter.write", 4L).A00(str, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        try {
            C72756XmX A00 = y3r.A00.A00(str);
            Object[] objArr = hyperThriftBase.A01;
            AbstractC95034Pm abstractC95034Pm = y3r.A01;
            abstractC95034Pm.A0U(new Object());
            C72755XmW[] c72755XmWArr = A00.A02;
            int length = c72755XmWArr.length;
            for (int i = 0; i < length; i++) {
                C72755XmW c72755XmW = c72755XmWArr[i];
                Object obj = objArr[i];
                if (obj != null && obj != HyperThriftBase.A02) {
                    String str2 = c72755XmW.A01;
                    if (str2 == null) {
                        str2 = "";
                    }
                    C72777Xmw c72777Xmw = c72755XmW.A00;
                    abstractC95034Pm.A0Q(new C95054Po(str2, AbstractC72552XgM.A00(c72777Xmw.A00), c72755XmW.A02));
                    A01(y3r, c72777Xmw, obj);
                }
            }
            abstractC95034Pm.A0J();
            abstractC95034Pm.A0K();
            C0fY.A00(4L, 228955420);
        } catch (Throwable th) {
            C0fY.A00(4L, -133026028);
            throw th;
        }
    }

    public static void A01(Y3R y3r, C72777Xmw c72777Xmw, Object obj) {
        switch (c72777Xmw.A00) {
            case 2:
                y3r.A01.A0X(AbstractC166987dD.A1a(obj));
                return;
            case 3:
                y3r.A01.A0L(((Number) obj).byteValue());
                return;
            case 4:
                y3r.A01.A0M(((Number) obj).doubleValue());
                return;
            case 5:
            case 7:
            case 9:
            case 17:
            case 18:
            default:
                return;
            case 6:
                y3r.A01.A0W(((Number) obj).shortValue());
                return;
            case 8:
            case 16:
                y3r.A01.A0O(AbstractC166987dD.A0H(obj));
                return;
            case 10:
                y3r.A01.A0P(AbstractC166987dD.A0N(obj));
                return;
            case 11:
                y3r.A01.A0V((String) obj);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A00((HyperThriftBase) obj, y3r, c72777Xmw.A03);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                AbstractMap abstractMap = (AbstractMap) obj;
                int size = abstractMap.size();
                AbstractC95034Pm abstractC95034Pm = y3r.A01;
                C72777Xmw c72777Xmw2 = c72777Xmw.A01;
                byte A00 = AbstractC72552XgM.A00(c72777Xmw2.A00);
                C72777Xmw c72777Xmw3 = c72777Xmw.A02;
                abstractC95034Pm.A0S(new C73303Xzu(A00, AbstractC72552XgM.A00(c72777Xmw3.A00), size));
                Iterator A14 = AbstractC166997dE.A14(abstractMap);
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    A01(y3r, c72777Xmw2, A1K.getKey());
                    A01(y3r, c72777Xmw3, A1K.getValue());
                }
                return;
            case 14:
                AbstractCollection abstractCollection = (AbstractCollection) obj;
                int size2 = abstractCollection.size();
                AbstractC95034Pm abstractC95034Pm2 = y3r.A01;
                C72777Xmw c72777Xmw4 = c72777Xmw.A01;
                abstractC95034Pm2.A0T(new C73294Xzj(size2, AbstractC72552XgM.A00(c72777Xmw4.A00)));
                Iterator it = abstractCollection.iterator();
                while (it.hasNext()) {
                    A01(y3r, c72777Xmw4, it.next());
                }
                return;
            case Process.SIGTERM /* 15 */:
                AbstractList abstractList = (AbstractList) obj;
                int size3 = abstractList.size();
                AbstractC95034Pm abstractC95034Pm3 = y3r.A01;
                C72777Xmw c72777Xmw5 = c72777Xmw.A01;
                abstractC95034Pm3.A0R(new C73293Xzi(size3, AbstractC72552XgM.A00(c72777Xmw5.A00)));
                for (int i = 0; i < size3; i++) {
                    A01(y3r, c72777Xmw5, abstractList.get(i));
                }
                return;
            case Process.SIGSTOP /* 19 */:
                y3r.A01.A0N(((Number) obj).floatValue());
                return;
            case 20:
                y3r.A01.A0Y((byte[]) obj);
                return;
        }
    }

    public Y3R(SL7 sl7, AbstractC95034Pm abstractC95034Pm) {
        this.A00 = sl7;
        this.A01 = abstractC95034Pm;
    }
}

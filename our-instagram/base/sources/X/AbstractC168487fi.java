package X;

import com.instagram.api.schemas.CommentGiphyMediaFixedHeightImages;
import com.instagram.api.schemas.CommentGiphyMediaImagesIntf;
import com.instagram.api.schemas.CommentGiphyMediaInfoIntf;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7fi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC168487fi {
    public static final C9BW A00(UserSession userSession, C38891rO c38891rO, String str, String str2, java.util.Set set, boolean z, boolean z2, boolean z3) {
        ArrayList arrayList;
        boolean z4;
        int i;
        boolean z5;
        int i2;
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 3);
        C167297di A01 = A01(userSession, c38891rO, null, str, str2, z, z2, z3, false);
        if (A01 != null) {
            String str3 = A01.A0K;
            List list = c38891rO.A11;
            if (list != null) {
                ArrayList<C38891rO> arrayList2 = new ArrayList();
                for (Object obj : list) {
                    String str4 = ((C38891rO) obj).A0r;
                    if (str4 == null) {
                        str4 = "";
                    }
                    if (!set.contains(str4)) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = new ArrayList();
                for (C38891rO c38891rO2 : arrayList2) {
                    String str5 = c38891rO2.A0r;
                    if (str5 != null) {
                        set.add(str5);
                    }
                    C167297di A012 = A01(userSession, c38891rO2, str3, str, str2, z, z2, z3, true);
                    if (A012 != null) {
                        arrayList.add(A012);
                    }
                }
            } else {
                arrayList = null;
            }
            Boolean bool = c38891rO.A0G;
            if (bool != null) {
                z4 = bool.booleanValue();
            } else {
                z4 = false;
            }
            Integer num = c38891rO.A0c;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            String str6 = c38891rO.A0o;
            Boolean bool2 = c38891rO.A0F;
            if (bool2 != null) {
                z5 = bool2.booleanValue();
            } else {
                z5 = false;
            }
            Integer num2 = c38891rO.A0b;
            if (num2 != null) {
                i2 = num2.intValue();
            } else {
                i2 = 0;
            }
            String str7 = c38891rO.A0p;
            Integer num3 = C05F.A00;
            C168557fp c168557fp = new C168557fp(num3, num3, str6, str7, i, i2, z4, z5, false);
            List list2 = arrayList;
            if (arrayList == null) {
                list2 = C16930sl.A00;
            }
            return new C9BW(new C206209Bd(c168557fp, list2, C16930sl.A00), A01);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x021d, code lost:
    
        if (r0 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0217, code lost:
    
        if (r0 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0211, code lost:
    
        if (r0 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x020b, code lost:
    
        if (r0 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0205, code lost:
    
        if (r0 != null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C167297di A01(com.instagram.common.session.UserSession r57, X.C38891rO r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, boolean r62, boolean r63, boolean r64, boolean r65) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC168487fi.A01(com.instagram.common.session.UserSession, X.1rO, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean):X.7di");
    }

    public static final C169277h1 A02(CommentGiphyMediaInfoIntf commentGiphyMediaInfoIntf) {
        CommentGiphyMediaFixedHeightImages commentGiphyMediaFixedHeightImages;
        boolean z;
        String B9n = commentGiphyMediaInfoIntf.B9n();
        CommentGiphyMediaImagesIntf BH0 = commentGiphyMediaInfoIntf.BH0();
        if (BH0 != null) {
            commentGiphyMediaFixedHeightImages = BH0.B6v();
        } else {
            commentGiphyMediaFixedHeightImages = null;
        }
        if (B9n == null || commentGiphyMediaFixedHeightImages == null) {
            return null;
        }
        Integer CHg = commentGiphyMediaFixedHeightImages.CHg();
        Integer BDS = commentGiphyMediaFixedHeightImages.BDS();
        String url = commentGiphyMediaFixedHeightImages.getUrl();
        if (CHg == null || BDS == null || url == null) {
            return null;
        }
        int intValue = CHg.intValue();
        int intValue2 = BDS.intValue();
        String CHQ = commentGiphyMediaFixedHeightImages.CHQ();
        Boolean Cdg = commentGiphyMediaInfoIntf.Cdg();
        if (Cdg != null) {
            z = Cdg.booleanValue();
        } else {
            z = false;
        }
        return new C169277h1(B9n, url, CHQ, commentGiphyMediaInfoIntf.getUsername(), intValue, intValue2, z);
    }
}

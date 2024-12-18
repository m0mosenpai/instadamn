package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Rsk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61729Rsk {
    /* JADX WARN: Type inference failed for: r4v0, types: [X.QIl, java.lang.Object] */
    public static final C5G6 A00(Context context, EnumC61149RgA enumC61149RgA, UserSession userSession, String str, String str2, java.util.Set set, java.util.Set set2) {
        C14360o3.A0B(userSession, 1);
        C43031yW c43031yW = new C43031yW(userSession);
        QIh qIh = new QIh(str, str2);
        C50627MWo c50627MWo = new C50627MWo(set, set2);
        MUG mug = new MUG(enumC61149RgA);
        C16910sj c16910sj = C16910sj.A00;
        AbstractC167027dH.A13(c16910sj, c16910sj, c16910sj);
        ?? obj = new Object();
        obj.A03 = c16910sj;
        obj.A06 = c16910sj;
        obj.A05 = c16910sj;
        obj.A00 = null;
        obj.A07 = null;
        obj.A04 = null;
        obj.A02 = null;
        obj.A01 = null;
        C62620SJd c62620SJd = new C62620SJd(context, qIh, obj, c50627MWo, mug);
        C63024Sau c63024Sau = new C63024Sau(c62620SJd, c43031yW);
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        return new C5G6(c63024Sau, c62620SJd, new C63021Sam(c43031yW, c006802i), new C62416SAq(userSession), c43031yW);
    }
}

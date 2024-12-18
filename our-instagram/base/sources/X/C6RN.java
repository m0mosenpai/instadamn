package X;

import com.instagram.api.schemas.StoryLinkInfoDict;

/* renamed from: X.6RN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6RN extends C6RO {
    public StoryLinkInfoDict A00;

    public final String A00() {
        String str;
        StoryLinkInfoDict storyLinkInfoDict = this.A00;
        if (storyLinkInfoDict == null || (str = storyLinkInfoDict.A0A) == null) {
            return "";
        }
        return str;
    }

    @Override // X.C5NL
    public final C5NG BlQ() {
        C5NG c5ng = new C5NG();
        c5ng.A01 = C5NH.A06;
        c5ng.A06 = C148276lx.A14.A01();
        c5ng.A01(super.A00);
        return c5ng;
    }

    @Override // X.C5NL
    public final Integer CBq() {
        return C05F.A0c;
    }
}

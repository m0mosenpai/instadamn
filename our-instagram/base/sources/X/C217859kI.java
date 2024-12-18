package X;

import com.instagram.api.schemas.StoryGroupMentionTappableData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9kI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217859kI extends C6RO {
    public StoryGroupMentionTappableData A00;
    public Integer A01;
    public String A02;
    public final Integer A03;
    public final String A04;
    public final List A05;
    public final List A06;

    public C217859kI(StoryGroupMentionTappableData storyGroupMentionTappableData) {
        Integer num;
        C14360o3.A0B(storyGroupMentionTappableData, 1);
        this.A00 = storyGroupMentionTappableData;
        this.A04 = storyGroupMentionTappableData.A02;
        Integer num2 = storyGroupMentionTappableData.A00;
        if (num2 != null) {
            int intValue = num2.intValue();
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue == 3) {
                        num = C05F.A0N;
                    }
                } else {
                    num = C05F.A0C;
                }
            } else {
                num = C05F.A01;
            }
            this.A01 = num;
            this.A03 = num2;
            this.A05 = storyGroupMentionTappableData.A04;
            this.A06 = AbstractC166987dD.A1E();
        }
        num = C05F.A00;
        this.A01 = num;
        this.A03 = num2;
        this.A05 = storyGroupMentionTappableData.A04;
        this.A06 = AbstractC166987dD.A1E();
    }

    public final void A02(Integer num) {
        int i;
        C14360o3.A0B(num, 0);
        this.A01 = num;
        StoryGroupMentionTappableData storyGroupMentionTappableData = this.A00;
        C14360o3.A0B(storyGroupMentionTappableData, 1);
        String str = storyGroupMentionTappableData.A02;
        List list = storyGroupMentionTappableData.A04;
        String str2 = storyGroupMentionTappableData.A03;
        switch (num.intValue()) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            default:
                i = 3;
                break;
        }
        Integer valueOf = Integer.valueOf(i);
        new C1DY((C1DV) new C37761pD(null), 6, false);
        this.A00 = new StoryGroupMentionTappableData(valueOf, null, str, str2, list);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C14360o3.A0K(cls2, cls)) {
            return false;
        }
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.reels.groupmention.model.GroupMentionStickerModel");
        C217859kI c217859kI = (C217859kI) obj;
        return C14360o3.A0K(this.A04, c217859kI.A04) && C14360o3.A0K(this.A00.A03, c217859kI.A00.A03) && C14360o3.A0K(this.A03, c217859kI.A03) && C14360o3.A0K(this.A00.A01, c217859kI.A00.A01) && C14360o3.A0K(this.A05, c217859kI.A05) && C14360o3.A0K(this.A06, c217859kI.A06);
    }

    public final StoryGroupMentionTappableData A00() {
        List list = this.A06;
        boolean isEmpty = list.isEmpty();
        StoryGroupMentionTappableData storyGroupMentionTappableData = this.A00;
        if (!isEmpty) {
            C14360o3.A0B(storyGroupMentionTappableData, 1);
            String str = storyGroupMentionTappableData.A01;
            String str2 = storyGroupMentionTappableData.A02;
            Integer num = storyGroupMentionTappableData.A00;
            String str3 = storyGroupMentionTappableData.A03;
            ArrayList A1E = AbstractC166987dD.A1E();
            A1E.addAll(this.A05);
            A1E.addAll(list);
            new C1DY((C1DV) new C37761pD(null), 6, false);
            return new StoryGroupMentionTappableData(num, str, str2, str3, A1E);
        }
        return storyGroupMentionTappableData;
    }

    public final void A03(String str) {
        StoryGroupMentionTappableData storyGroupMentionTappableData = this.A00;
        C14360o3.A0B(storyGroupMentionTappableData, 1);
        String str2 = storyGroupMentionTappableData.A02;
        List list = storyGroupMentionTappableData.A04;
        Integer num = storyGroupMentionTappableData.A00;
        String str3 = storyGroupMentionTappableData.A03;
        AbstractC167017dG.A0x();
        this.A00 = new StoryGroupMentionTappableData(num, str, str2, str3, list);
    }

    @Override // X.C5NL
    public final Integer CBq() {
        return C05F.A0s;
    }

    public final int hashCode() {
        int i;
        int A0J = AbstractC166987dD.A0J(this.A04);
        StoryGroupMentionTappableData storyGroupMentionTappableData = this.A00;
        String str = storyGroupMentionTappableData.A03;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int A0K = (((A0J + i) * 31) + AbstractC167017dG.A0K(this.A03)) * 31;
        String str2 = storyGroupMentionTappableData.A01;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return AbstractC166987dD.A0I(this.A06, AbstractC166997dE.A0J(this.A05, (A0K + i2) * 31));
    }

    public final C217859kI A01() {
        StoryGroupMentionTappableData A00 = A00();
        C14360o3.A0B(A00, 1);
        String str = A00.A01;
        String str2 = A00.A02;
        List list = A00.A04;
        Integer num = A00.A00;
        String str3 = A00.A03;
        AbstractC167017dG.A0x();
        return new C217859kI(new StoryGroupMentionTappableData(num, str, str2, str3, list));
    }

    @Override // X.C5NL
    public final C5NG BlQ() {
        List A01;
        C5NG A0V = AbstractC167007dF.A0V();
        String str = this.A04;
        if (str.length() > 0) {
            A01 = AbstractC166987dD.A1J(str);
        } else {
            A01 = C148276lx.A0t.A01();
        }
        A0V.A06 = A01;
        return A0V;
    }
}

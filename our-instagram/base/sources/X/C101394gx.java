package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.PollType;
import com.instagram.api.schemas.StoryPollColorType;
import java.util.List;

/* renamed from: X.4gx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101394gx extends C0T6 implements InterfaceC101404gy {
    public final PollType A00;
    public final C87493vH A01;
    public final StoryPollColorType A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Integer A08;
    public final Integer A09;
    public final Integer A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final List A0E;
    public final List A0F;

    @Override // X.InterfaceC101404gy
    public final InterfaceC101404gy EC4(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC101404gy
    public final C101394gx F6u(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC101404gy
    public final C101394gx F6v(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C101394gx) {
                C101394gx c101394gx = (C101394gx) obj;
                if (this.A02 != c101394gx.A02 || !C14360o3.A0K(this.A08, c101394gx.A08) || !C14360o3.A0K(this.A03, c101394gx.A03) || !C14360o3.A0K(this.A0B, c101394gx.A0B) || !C14360o3.A0K(this.A04, c101394gx.A04) || !C14360o3.A0K(this.A05, c101394gx.A05) || !C14360o3.A0K(this.A0C, c101394gx.A0C) || this.A00 != c101394gx.A00 || !C14360o3.A0K(this.A0E, c101394gx.A0E) || !C14360o3.A0K(this.A0D, c101394gx.A0D) || !C14360o3.A0K(this.A01, c101394gx.A01) || !C14360o3.A0K(this.A0F, c101394gx.A0F) || !C14360o3.A0K(this.A09, c101394gx.A09) || !C14360o3.A0K(this.A06, c101394gx.A06) || !C14360o3.A0K(this.A07, c101394gx.A07) || !C14360o3.A0K(this.A0A, c101394gx.A0A)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        StoryPollColorType storyPollColorType = this.A02;
        int hashCode = (storyPollColorType == null ? 0 : storyPollColorType.hashCode()) * 31;
        Integer num = this.A08;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.A03;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.A0B;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.A04;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A05;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.A0C;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PollType pollType = this.A00;
        int hashCode8 = (hashCode7 + (pollType == null ? 0 : pollType.hashCode())) * 31;
        List list = this.A0E;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.A0D;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C87493vH c87493vH = this.A01;
        int hashCode11 = (hashCode10 + (c87493vH == null ? 0 : c87493vH.hashCode())) * 31;
        List list2 = this.A0F;
        int hashCode12 = (hashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num2 = this.A09;
        int hashCode13 = (hashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.A06;
        int hashCode14 = (hashCode13 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.A07;
        int hashCode15 = (hashCode14 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.A0A;
        return hashCode15 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // X.InterfaceC101404gy
    public final StoryPollColorType ApJ() {
        return this.A02;
    }

    @Override // X.InterfaceC101404gy
    public final Integer B3B() {
        return this.A08;
    }

    @Override // X.InterfaceC101404gy
    public final Boolean B6X() {
        return this.A03;
    }

    @Override // X.InterfaceC101404gy
    public final PollType BeO() {
        return this.A00;
    }

    @Override // X.InterfaceC101404gy
    public final List Bic() {
        return this.A0E;
    }

    @Override // X.InterfaceC101404gy
    public final /* bridge */ /* synthetic */ InterfaceC87503vI ByI() {
        return this.A01;
    }

    @Override // X.InterfaceC101404gy
    public final List C5D() {
        return this.A0F;
    }

    @Override // X.InterfaceC101404gy
    public final Integer CA0() {
        return this.A09;
    }

    @Override // X.InterfaceC101404gy
    public final Boolean CG3() {
        return this.A06;
    }

    @Override // X.InterfaceC101404gy
    public final Boolean CGC() {
        return this.A07;
    }

    @Override // X.InterfaceC101404gy
    public final Integer CGO() {
        return this.A0A;
    }

    @Override // X.InterfaceC101404gy
    public final Boolean CYz() {
        return this.A04;
    }

    @Override // X.InterfaceC101404gy
    public final Boolean Ccy() {
        return this.A05;
    }

    @Override // X.InterfaceC101404gy
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTPollSticker", AbstractC27697CJq.A00(this));
    }

    @Override // X.InterfaceC101404gy
    public final String getId() {
        return this.A0B;
    }

    @Override // X.InterfaceC101404gy
    public final String getPollId() {
        return this.A0C;
    }

    @Override // X.InterfaceC101404gy
    public final String getQuestion() {
        return this.A0D;
    }

    public C101394gx(PollType pollType, C87493vH c87493vH, StoryPollColorType storyPollColorType, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num, Integer num2, Integer num3, String str, String str2, String str3, List list, List list2) {
        this.A02 = storyPollColorType;
        this.A08 = num;
        this.A03 = bool;
        this.A0B = str;
        this.A04 = bool2;
        this.A05 = bool3;
        this.A0C = str2;
        this.A00 = pollType;
        this.A0E = list;
        this.A0D = str3;
        this.A01 = c87493vH;
        this.A0F = list2;
        this.A09 = num2;
        this.A06 = bool4;
        this.A07 = bool5;
        this.A0A = num3;
    }
}

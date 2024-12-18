package X;

import com.instagram.api.schemas.MediaPromptPrefType;
import com.instagram.api.schemas.StoryPromptDisablementState;
import java.util.List;

/* renamed from: X.Mv7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51803Mv7 extends C0T6 implements YQI {
    public final int A00;
    public final MediaPromptPrefType A01;
    public final MediaPromptPrefType A02;
    public final C51798Mv2 A03;
    public final C51800Mv4 A04;
    public final StoryPromptDisablementState A05;
    public final C51801Mv5 A06;
    public final String A07;
    public final List A08;
    public final List A09;
    public final boolean A0A;

    public C51803Mv7(MediaPromptPrefType mediaPromptPrefType, MediaPromptPrefType mediaPromptPrefType2, C51798Mv2 c51798Mv2, C51800Mv4 c51800Mv4, StoryPromptDisablementState storyPromptDisablementState, C51801Mv5 c51801Mv5, String str, List list, List list2, int i, boolean z) {
        AbstractC25234BEr.A0k(4, mediaPromptPrefType, storyPromptDisablementState, str, mediaPromptPrefType2);
        AbstractC167007dF.A1J(c51801Mv5, 8, list);
        this.A03 = c51798Mv2;
        this.A0A = z;
        this.A04 = c51800Mv4;
        this.A01 = mediaPromptPrefType;
        this.A05 = storyPromptDisablementState;
        this.A07 = str;
        this.A02 = mediaPromptPrefType2;
        this.A06 = c51801Mv5;
        this.A08 = list;
        this.A09 = list2;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51803Mv7) {
                C51803Mv7 c51803Mv7 = (C51803Mv7) obj;
                if (!C14360o3.A0K(this.A03, c51803Mv7.A03) || this.A0A != c51803Mv7.A0A || !C14360o3.A0K(this.A04, c51803Mv7.A04) || this.A01 != c51803Mv7.A01 || this.A05 != c51803Mv7.A05 || !C14360o3.A0K(this.A07, c51803Mv7.A07) || this.A02 != c51803Mv7.A02 || !C14360o3.A0K(this.A06, c51803Mv7.A06) || !C14360o3.A0K(this.A08, c51803Mv7.A08) || !C14360o3.A0K(this.A09, c51803Mv7.A09) || this.A00 != c51803Mv7.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A08, AbstractC166997dE.A0J(this.A06, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0K(this.A07, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A01, (AbstractC167007dF.A0D(this.A0A, AbstractC167017dG.A0M(this.A03) * 31) + AbstractC167017dG.A0M(this.A04)) * 31)))))) + AbstractC166997dE.A0I(this.A09)) * 31) + this.A00;
    }
}

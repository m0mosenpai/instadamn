package X;

import com.instagram.api.schemas.MediaPromptPrefType;
import com.instagram.api.schemas.StoryPromptDisablementState;
import java.util.List;

/* renamed from: X.Mv8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51804Mv8 extends C0T6 implements InterfaceC58247Prr {
    public final int A00;
    public final MediaPromptPrefType A01;
    public final MediaPromptPrefType A02;
    public final C51800Mv4 A03;
    public final StoryPromptDisablementState A04;
    public final C51801Mv5 A05;
    public final String A06;
    public final List A07;
    public final List A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51804Mv8) {
                C51804Mv8 c51804Mv8 = (C51804Mv8) obj;
                if (!C14360o3.A0K(this.A03, c51804Mv8.A03) || this.A01 != c51804Mv8.A01 || this.A04 != c51804Mv8.A04 || !C14360o3.A0K(this.A06, c51804Mv8.A06) || this.A02 != c51804Mv8.A02 || !C14360o3.A0K(this.A05, c51804Mv8.A05) || !C14360o3.A0K(this.A07, c51804Mv8.A07) || !C14360o3.A0K(this.A08, c51804Mv8.A08) || this.A00 != c51804Mv8.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A01, AbstractC167017dG.A0M(this.A03) * 31)))))) + AbstractC166997dE.A0I(this.A08)) * 31) + this.A00;
    }

    public C51804Mv8(MediaPromptPrefType mediaPromptPrefType, MediaPromptPrefType mediaPromptPrefType2, C51800Mv4 c51800Mv4, StoryPromptDisablementState storyPromptDisablementState, C51801Mv5 c51801Mv5, String str, List list, List list2, int i) {
        AbstractC25234BEr.A1R(mediaPromptPrefType, storyPromptDisablementState, str, mediaPromptPrefType2, c51801Mv5);
        C14360o3.A0B(list, 7);
        this.A03 = c51800Mv4;
        this.A01 = mediaPromptPrefType;
        this.A04 = storyPromptDisablementState;
        this.A06 = str;
        this.A02 = mediaPromptPrefType2;
        this.A05 = c51801Mv5;
        this.A07 = list;
        this.A08 = list2;
        this.A00 = i;
    }
}

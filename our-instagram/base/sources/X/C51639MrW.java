package X;

import com.instagram.api.schemas.MediaPromptPrefType;
import com.instagram.api.schemas.StoryPromptDisablementState;
import java.util.List;

/* renamed from: X.MrW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51639MrW extends C0T6 {
    public MediaPromptPrefType A00;
    public final MediaPromptPrefType A01;
    public final InterfaceC58242Prm A02;
    public final InterfaceC58244Pro A03;
    public final StoryPromptDisablementState A04;
    public final InterfaceC58245Prp A05;
    public final String A06;
    public final List A07;
    public final List A08;
    public final boolean A09;

    public C51639MrW(MediaPromptPrefType mediaPromptPrefType, MediaPromptPrefType mediaPromptPrefType2, InterfaceC58242Prm interfaceC58242Prm, InterfaceC58244Pro interfaceC58244Pro, StoryPromptDisablementState storyPromptDisablementState, InterfaceC58245Prp interfaceC58245Prp, String str, List list, List list2, boolean z) {
        AbstractC25234BEr.A0k(4, mediaPromptPrefType, storyPromptDisablementState, str, mediaPromptPrefType2);
        AbstractC167007dF.A1J(interfaceC58245Prp, 8, list);
        this.A02 = interfaceC58242Prm;
        this.A09 = z;
        this.A03 = interfaceC58244Pro;
        this.A01 = mediaPromptPrefType;
        this.A04 = storyPromptDisablementState;
        this.A06 = str;
        this.A00 = mediaPromptPrefType2;
        this.A05 = interfaceC58245Prp;
        this.A07 = list;
        this.A08 = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51639MrW) {
                C51639MrW c51639MrW = (C51639MrW) obj;
                if (!C14360o3.A0K(this.A02, c51639MrW.A02) || this.A09 != c51639MrW.A09 || !C14360o3.A0K(this.A03, c51639MrW.A03) || this.A01 != c51639MrW.A01 || this.A04 != c51639MrW.A04 || !C14360o3.A0K(this.A06, c51639MrW.A06) || this.A00 != c51639MrW.A00 || !C14360o3.A0K(this.A05, c51639MrW.A05) || !C14360o3.A0K(this.A07, c51639MrW.A07) || !C14360o3.A0K(this.A08, c51639MrW.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A01, (AbstractC167007dF.A0D(this.A09, AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0M(this.A03)) * 31)))))) + AbstractC166997dE.A0I(this.A08);
    }
}

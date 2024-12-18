package X;

import com.instagram.api.schemas.StoryPromptTappableData;
import java.util.List;

/* renamed from: X.Jzt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45213Jzt extends C0T6 implements InterfaceC66482zP {
    public final int A00;
    public final StoryPromptTappableData A01;
    public final H6G A02;
    public final List A03;
    public final List A04;

    public C45213Jzt(StoryPromptTappableData storyPromptTappableData, H6G h6g, List list, List list2, int i) {
        C14360o3.A0B(storyPromptTappableData, 1);
        this.A01 = storyPromptTappableData;
        this.A02 = h6g;
        this.A00 = i;
        this.A03 = list;
        this.A04 = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45213Jzt) {
                C45213Jzt c45213Jzt = (C45213Jzt) obj;
                if (!C14360o3.A0K(this.A01, c45213Jzt.A01) || !C14360o3.A0K(this.A02, c45213Jzt.A02) || this.A00 != c45213Jzt.A00 || !C14360o3.A0K(this.A03, c45213Jzt.A03) || !C14360o3.A0K(this.A04, c45213Jzt.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01.A0M;
    }

    public final int hashCode() {
        return ((((((AbstractC166987dD.A0G(this.A01) + AbstractC167017dG.A0M(this.A02)) * 31) + this.A00) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A04);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        StoryPromptTappableData storyPromptTappableData;
        C45213Jzt c45213Jzt = (C45213Jzt) obj;
        String str2 = this.A01.A0M;
        if (c45213Jzt != null && (storyPromptTappableData = c45213Jzt.A01) != null) {
            str = storyPromptTappableData.A0M;
        } else {
            str = null;
        }
        return C14360o3.A0K(str2, str);
    }
}

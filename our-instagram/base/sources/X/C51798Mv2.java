package X;

import com.instagram.api.schemas.StoryMusicPickAggregationVisibility;
import java.util.List;

/* renamed from: X.Mv2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51798Mv2 extends C0T6 implements InterfaceC58242Prm {
    public final StoryMusicPickAggregationVisibility A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51798Mv2) {
                C51798Mv2 c51798Mv2 = (C51798Mv2) obj;
                if (this.A00 != c51798Mv2.A00 || !C14360o3.A0K(this.A01, c51798Mv2.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public C51798Mv2(StoryMusicPickAggregationVisibility storyMusicPickAggregationVisibility, List list) {
        AbstractC167017dG.A1P(storyMusicPickAggregationVisibility, list);
        this.A00 = storyMusicPickAggregationVisibility;
        this.A01 = list;
    }
}

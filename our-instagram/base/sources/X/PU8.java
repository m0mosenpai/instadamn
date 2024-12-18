package X;

import com.instagram.tagging.widget.TagsLayout;
import java.util.Comparator;

/* loaded from: classes9.dex */
public final class PU8 implements Comparator {
    public final /* synthetic */ TagsLayout A00;

    public PU8(TagsLayout tagsLayout) {
        this.A00 = tagsLayout;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return (int) (AbstractC50789Mc6.A01((AbstractC50789Mc6) obj).A07.x - AbstractC50789Mc6.A01((AbstractC50789Mc6) obj2).A07.x);
    }
}

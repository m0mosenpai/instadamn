package X;

import com.instagram.save.model.SavedCollection;

/* renamed from: X.Eeg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32949Eeg extends AbstractC65332xV {
    @Override // X.AbstractC65332xV
    public final int A02() {
        return (int) Math.ceil(this.A01.size() / 2.0d);
    }

    @Override // X.AbstractC65332xV
    public final /* bridge */ /* synthetic */ String A03(Object obj) {
        SavedCollection savedCollection = (SavedCollection) obj;
        C14360o3.A0B(savedCollection, 0);
        String str = savedCollection.A0F;
        C14360o3.A07(str);
        return str;
    }
}

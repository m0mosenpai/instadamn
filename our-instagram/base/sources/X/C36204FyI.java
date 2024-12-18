package X;

import com.instagram.save.model.CollaborativeCollectionMetadata;
import com.instagram.save.model.SavedCollection;

/* renamed from: X.FyI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36204FyI implements InterfaceC66482zP {
    public final SavedCollection A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String str;
        SavedCollection savedCollection = this.A00;
        if (savedCollection == null || (str = savedCollection.A0F) == null) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        String str2;
        Boolean bool;
        Boolean bool2;
        String str3;
        SavedCollection savedCollection;
        CollaborativeCollectionMetadata collaborativeCollectionMetadata;
        CollaborativeCollectionMetadata collaborativeCollectionMetadata2;
        SavedCollection savedCollection2;
        C36204FyI c36204FyI = (C36204FyI) obj;
        SavedCollection savedCollection3 = this.A00;
        if (savedCollection3 == null || (str = savedCollection3.A0F) == null) {
            str = "";
        }
        String str4 = null;
        if (c36204FyI != null) {
            SavedCollection savedCollection4 = c36204FyI.A00;
            if (savedCollection4 == null || (str2 = savedCollection4.A0F) == null) {
                str2 = "";
            }
        } else {
            str2 = null;
        }
        if (C14360o3.A0K(str, str2)) {
            if (savedCollection3 != null) {
                bool = Boolean.valueOf(savedCollection3.A05());
            } else {
                bool = null;
            }
            if (c36204FyI != null && (savedCollection2 = c36204FyI.A00) != null) {
                bool2 = Boolean.valueOf(savedCollection2.A05());
            } else {
                bool2 = null;
            }
            if (C14360o3.A0K(bool, bool2)) {
                if (savedCollection3 != null && (collaborativeCollectionMetadata2 = savedCollection3.A05) != null) {
                    str3 = collaborativeCollectionMetadata2.A01;
                } else {
                    str3 = null;
                }
                if (c36204FyI != null && (savedCollection = c36204FyI.A00) != null && (collaborativeCollectionMetadata = savedCollection.A05) != null) {
                    str4 = collaborativeCollectionMetadata.A01;
                }
                if (C14360o3.A0K(str3, str4)) {
                    return true;
                }
            }
        }
        return false;
    }

    public C36204FyI(SavedCollection savedCollection, String str, boolean z, boolean z2, boolean z3) {
        this.A00 = savedCollection;
        this.A04 = z;
        this.A01 = str;
        this.A02 = z2;
        this.A03 = z3;
    }
}

package X;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes11.dex */
public final class X6R extends C3SH {
    public final SerialDescriptor A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X6R(C3R9 c3r9) {
        super(c3r9);
        C14360o3.A0B(c3r9, 1);
        SerialDescriptor descriptor = c3r9.getDescriptor();
        C14360o3.A0B(descriptor, 1);
        this.A00 = new C3SK(descriptor);
    }

    @Override // X.C3RN
    public final /* bridge */ /* synthetic */ Object A04(Object obj) {
        C14360o3.A0B(obj, 0);
        return obj;
    }

    @Override // X.C3RN
    public final /* bridge */ /* synthetic */ int A00(Object obj) {
        AbstractCollection abstractCollection = (AbstractCollection) obj;
        C14360o3.A0B(abstractCollection, 0);
        return abstractCollection.size();
    }

    @Override // X.C3RN
    public final /* bridge */ /* synthetic */ Object A02() {
        return new LinkedHashSet();
    }

    @Override // X.C3RN
    public final /* bridge */ /* synthetic */ Object A03(Object obj) {
        Collection collection = (Collection) obj;
        C14360o3.A0B(collection, 0);
        if (collection instanceof LinkedHashSet) {
            return collection;
        }
        return new LinkedHashSet(collection);
    }

    @Override // X.C3SI
    public final /* bridge */ /* synthetic */ void A07(Object obj, int i, Object obj2) {
        AbstractCollection abstractCollection = (AbstractCollection) obj;
        C14360o3.A0B(abstractCollection, 0);
        abstractCollection.add(obj2);
    }

    @Override // X.C3SI, X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return this.A00;
    }
}

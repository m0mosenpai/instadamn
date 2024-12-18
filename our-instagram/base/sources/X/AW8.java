package X;

import android.util.SparseArray;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterGroup;

/* loaded from: classes4.dex */
public final class AW8 implements InterfaceC199548s4 {
    public final SparseArray A00 = new SparseArray();
    public final C199518rz A01;
    public final FilterGroup A02;

    @Override // X.InterfaceC199548s4
    public final void AC1(FilterManagerImpl filterManagerImpl, AnonymousClass810 anonymousClass810, String str) {
    }

    @Override // X.InterfaceC199548s4
    public final void AC6(FilterManagerImpl filterManagerImpl) {
        FilterGroup filterGroup = this.A02;
        if (filterManagerImpl.mCachedModel != filterGroup) {
            filterManagerImpl.mCachedModel = filterGroup;
            filterManagerImpl.createFilterGroup();
        }
        SparseArray sparseArray = this.A00;
        SparseArray sparseArray2 = filterGroup.A01;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray2.keyAt(i);
            if (sparseArray2.get(keyAt) == null) {
                filterManagerImpl.unsetFilterGroupPosition(keyAt);
            }
            sparseArray.put(keyAt, null);
        }
        int size2 = sparseArray2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            int keyAt2 = sparseArray2.keyAt(i2);
            FilterModel A0g = AbstractC166987dD.A0g(sparseArray2, keyAt2);
            if (A0g != null) {
                InterfaceC199548s4 interfaceC199548s4 = (InterfaceC199548s4) sparseArray.get(keyAt2);
                if (interfaceC199548s4 == null || interfaceC199548s4.B6R() != A0g) {
                    interfaceC199548s4 = this.A01.A00(A0g);
                    sparseArray.put(keyAt2, interfaceC199548s4);
                }
                interfaceC199548s4.AC6(filterManagerImpl.getSubFilterManager(keyAt2));
                filterManagerImpl.syncFilterGroupPosition(keyAt2);
                Object obj = sparseArray2.get(keyAt2);
                obj.getClass();
                filterManagerImpl.setFilterGroupPositionEnabled(keyAt2, ((FilterModel) obj).isEnabled());
                if (keyAt2 == 27 && A0g.isEnabled()) {
                    filterManagerImpl.setFilterUseOutputFromGroup(keyAt2, false);
                }
            }
        }
    }

    @Override // X.InterfaceC199548s4
    public final void ACI(FilterManagerImpl filterManagerImpl, float[] fArr, float[] fArr2) {
        SparseArray sparseArray = this.A00;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            InterfaceC199548s4 interfaceC199548s4 = (InterfaceC199548s4) sparseArray.get(keyAt);
            if (interfaceC199548s4 != null) {
                interfaceC199548s4.ACI(filterManagerImpl.getSubFilterManager(keyAt), fArr, fArr2);
            }
        }
    }

    @Override // X.InterfaceC199548s4
    public final void ACJ(FilterManagerImpl filterManagerImpl) {
        SparseArray sparseArray = this.A00;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            InterfaceC199548s4 interfaceC199548s4 = (InterfaceC199548s4) sparseArray.valueAt(i);
            if (interfaceC199548s4 != null) {
                interfaceC199548s4.ACJ(filterManagerImpl.getSubFilterManager(keyAt));
            }
        }
    }

    @Override // X.InterfaceC199548s4
    public final FilterModel B6R() {
        return this.A02;
    }

    public AW8(C199518rz c199518rz, FilterGroup filterGroup) {
        this.A02 = filterGroup;
        this.A01 = c199518rz;
    }
}

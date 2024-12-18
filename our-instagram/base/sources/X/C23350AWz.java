package X;

import android.os.Bundle;
import com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration;
import com.facebook.cameracore.util.memory.VersionedSharedMemory;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: X.AWz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23350AWz implements InterfaceC150446pt {
    public final /* synthetic */ C24213Aof A00;

    @Override // X.InterfaceC150446pt
    public final void DYd(PickerConfiguration pickerConfiguration, String str) {
        int i;
        C14360o3.A0B(pickerConfiguration, 1);
        PickerConfiguration.ItemConfiguration[] itemConfigurationArr = pickerConfiguration.mItems;
        C14360o3.A07(itemConfigurationArr);
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        ArrayList A1E3 = AbstractC166987dD.A1E();
        ArrayList A1E4 = AbstractC166987dD.A1E();
        for (PickerConfiguration.ItemConfiguration itemConfiguration : itemConfigurationArr) {
            A1E.add(itemConfiguration.mImageUri);
            A1E2.add(itemConfiguration.mTitle);
            A1E3.add(itemConfiguration.mId);
            byte[] bArr = itemConfiguration.mImageData;
            if (bArr != null) {
                i = bArr.length;
            } else {
                i = 0;
            }
            AbstractC166997dE.A1W(A1E4, i);
        }
        Bundle A00 = AbstractC61636Rr0.A00(AbstractC167027dH.A0X(), AbstractC167027dH.A0Y(C05F.A00), AbstractC166987dD.A1L("selectedIndex", Integer.valueOf(pickerConfiguration.mSelectedIndex)), AbstractC166987dD.A1L("imageUris", A1E), AbstractC166987dD.A1L("titles", A1E2), AbstractC166987dD.A1L("ids", A1E3), AbstractC166987dD.A1L("sizes", A1E4));
        if (AbstractC001800i.A02(A1E4) > 0) {
            C24213Aof c24213Aof = this.A00;
            VersionedSharedMemory A01 = VersionedSharedMemory.CREATOR.A01("ui_control_picker_image_data", AbstractC001800i.A02(A1E4));
            c24213Aof.A04 = A01;
            ByteBuffer mapReadWrite = A01.mapReadWrite();
            if (mapReadWrite != null) {
                mapReadWrite.position(0);
            }
            for (PickerConfiguration.ItemConfiguration itemConfiguration2 : itemConfigurationArr) {
                if (mapReadWrite != null) {
                    mapReadWrite.put(itemConfiguration2.mImageData);
                }
            }
            VersionedSharedMemory versionedSharedMemory = c24213Aof.A04;
            if (versionedSharedMemory != null) {
                versionedSharedMemory.unmap(mapReadWrite);
            }
            A00.putParcelable("imagesData", c24213Aof.A04);
        }
        this.A00.A09.add(A00);
    }

    @Override // X.InterfaceC150446pt
    public final void DYg(InterfaceC25157BBb interfaceC25157BBb, String str) {
        C14360o3.A0B(interfaceC25157BBb, 1);
        C24213Aof c24213Aof = this.A00;
        c24213Aof.A02 = interfaceC25157BBb;
        AbstractC167027dH.A15(C05F.A01, c24213Aof.A09, AbstractC167027dH.A0X());
    }

    public C23350AWz(C24213Aof c24213Aof) {
        this.A00 = c24213Aof;
    }

    @Override // X.InterfaceC150446pt
    public final void DYe() {
        AbstractC167027dH.A15(C05F.A0C, this.A00.A09, AbstractC167027dH.A0X());
    }

    @Override // X.InterfaceC150446pt
    public final void DYf(String str, int i) {
        AbstractC167027dH.A14("index", Integer.valueOf(i), this.A00.A09, AbstractC167027dH.A0X(), AbstractC167027dH.A0Y(C05F.A0N));
    }
}

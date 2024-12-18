package X;

import android.os.Bundle;
import com.facebook.cameracore.util.memory.VersionedSharedMemory;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Aof, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24213Aof implements BCI {
    public InterfaceC203868zv A00;
    public InterfaceC25156BBa A01;
    public InterfaceC25157BBb A02;
    public BCV A03;
    public VersionedSharedMemory A04;
    public final List A09 = AbstractC166987dD.A1E();
    public final InterfaceC150446pt A05 = new C23350AWz(this);
    public final InterfaceC150466pv A07 = new AX2(this);
    public final InterfaceC150406pp A08 = new AX4(this);
    public final InterfaceC150426pr A06 = new AX1(this);

    @Override // X.BCI
    public final List Epm(Bundle bundle) {
        VersionedSharedMemory versionedSharedMemory;
        String string;
        BCV bcv;
        String string2;
        InterfaceC203868zv interfaceC203868zv;
        C14360o3.A0B(bundle, 0);
        if (bundle.containsKey("commandType")) {
            int i = bundle.getInt("commandType");
            if (i == 11) {
                if (bundle.containsKey("index")) {
                    int i2 = bundle.getInt("index");
                    InterfaceC25157BBb interfaceC25157BBb = this.A02;
                    if (interfaceC25157BBb != null) {
                        interfaceC25157BBb.onPickerItemSelected(i2);
                    }
                }
            } else if (i == 12) {
                if (bundle.containsKey("newText") && (string2 = bundle.getString("newText")) != null && (interfaceC203868zv = this.A00) != null) {
                    interfaceC203868zv.onTextEditComplete(string2);
                }
            } else if (i == 14) {
                if (bundle.containsKey("newText") && (string = bundle.getString("newText")) != null && (bcv = this.A03) != null) {
                    bcv.onTextChanged(string);
                }
            } else if (i == 13) {
                BCV bcv2 = this.A03;
                if (bcv2 != null) {
                    bcv2.onExit();
                }
            } else if (i == 15) {
                if (bundle.containsKey("newValue")) {
                    float f = bundle.getFloat("newValue");
                    InterfaceC25156BBa interfaceC25156BBa = this.A01;
                    if (interfaceC25156BBa != null) {
                        interfaceC25156BBa.onAdjustableValueChanged(f);
                    }
                }
            } else if (i == 16 && (versionedSharedMemory = this.A04) != null) {
                versionedSharedMemory.close();
                this.A04 = null;
            }
        }
        List list = this.A09;
        if (!AbstractC166987dD.A1b(list)) {
            return null;
        }
        ArrayList A1F = AbstractC166987dD.A1F(list);
        list.clear();
        return A1F;
    }
}

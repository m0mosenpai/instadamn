package X;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7v2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C177687v2 extends AbstractC176767tY {
    public int A00;
    public final CameraExtensionCharacteristics A01;
    public final AbstractC176767tY A02;
    public final List A03;
    public final Map A05 = new HashMap();
    public final Map A08 = new HashMap();
    public final Map A07 = new HashMap();
    public final Map A06 = new HashMap();
    public final Map A04 = new HashMap();

    public C177687v2(CameraExtensionCharacteristics cameraExtensionCharacteristics, AbstractC176767tY abstractC176767tY) {
        this.A00 = -1;
        ArrayList arrayList = new ArrayList();
        this.A03 = arrayList;
        this.A02 = abstractC176767tY;
        this.A01 = cameraExtensionCharacteristics;
        arrayList.add(-1);
        this.A00 = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r0.contains(r2) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bc, code lost:
    
        if (((java.lang.Boolean) r10.A02.A01(X.AbstractC176767tY.A0d)).booleanValue() == false) goto L44;
     */
    @Override // X.AbstractC176767tY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.C176777tZ r11) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C177687v2.A01(X.7tZ):java.lang.Object");
    }

    private List A00(CameraExtensionCharacteristics cameraExtensionCharacteristics, C176777tZ c176777tZ, int i, int i2, int i3) {
        List<Size> extensionSupportedSizes;
        List emptyList;
        if (cameraExtensionCharacteristics == null) {
            return Collections.emptyList();
        }
        if (i == 1) {
            extensionSupportedSizes = cameraExtensionCharacteristics.getExtensionSupportedSizes(i3, i2);
        } else {
            extensionSupportedSizes = cameraExtensionCharacteristics.getExtensionSupportedSizes(i3, SurfaceTexture.class);
        }
        if (extensionSupportedSizes != null && !extensionSupportedSizes.isEmpty()) {
            int size = extensionSupportedSizes.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                arrayList.add(new C176877tj(extensionSupportedSizes.get(i4).getWidth(), extensionSupportedSizes.get(i4).getHeight()));
            }
            emptyList = Collections.unmodifiableList(arrayList);
        } else {
            emptyList = Collections.emptyList();
        }
        return AbstractC176867ti.A00((List) this.A02.A01(c176777tZ), emptyList);
    }

    public final void A02(int i) {
        this.A00 = i;
        if (i != -1) {
            Map map = this.A04;
            Integer valueOf = Integer.valueOf(i);
            if (!map.containsKey(valueOf)) {
                map.put(valueOf, this.A01.getAvailableCaptureRequestKeys(i));
            }
        }
    }
}

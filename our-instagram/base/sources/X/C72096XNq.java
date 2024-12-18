package X;

import android.graphics.ImageFormat;
import android.hardware.Camera;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.XNq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72096XNq {
    public boolean A02;
    public int A00 = 0;
    public C176877tj A01 = new C176877tj(0, 0);
    public final C1814082s A03 = new C1814082s();
    public final ArrayList A04 = AbstractC166987dD.A1E();
    public final HashMap A05 = AbstractC166987dD.A1G();
    public final Camera.PreviewCallback A06 = new C72098XNs(this);
    public final Camera.PreviewCallback A07 = new C72097XNr(this);

    public final synchronized void A00() {
        this.A03.A00();
        this.A05.clear();
        this.A04.clear();
    }

    public final synchronized void A01(Camera camera) {
        if (!C176567tE.A02()) {
            camera.setPreviewCallbackWithBuffer(null);
            camera.setPreviewCallback(null);
            this.A02 = false;
        } else {
            throw AbstractC166987dD.A18("Cannot disable listeners on the UI thread");
        }
    }

    public final synchronized void A02(Camera camera, C176877tj c176877tj, int i) {
        int i2;
        if (!C176567tE.A02()) {
            if (!this.A02) {
                this.A00 = i;
                if (c176877tj == null) {
                    c176877tj = new C176877tj(0, 0);
                }
                this.A01 = c176877tj;
                camera.getClass();
                HashMap hashMap = this.A05;
                if (!hashMap.isEmpty()) {
                    camera.setPreviewCallback(null);
                    C176877tj c176877tj2 = this.A01;
                    try {
                        Iterator A0k = AbstractC167007dF.A0k(hashMap);
                        int i3 = 0;
                        int i4 = 0;
                        while (A0k.hasNext()) {
                            int intValue = ((Integer) A0k.next()).intValue();
                            if (intValue > i4) {
                                i4 = intValue;
                            }
                        }
                        if (i != 842094169) {
                            i2 = ImageFormat.getBitsPerPixel(i) * c176877tj2.A02 * c176877tj2.A01;
                            if (i2 % 8 != 0) {
                                throw AbstractC166987dD.A14("Total bits for Frame should be a multiple of 8");
                            }
                        } else {
                            int ceil = ((int) Math.ceil(c176877tj2.A02 / 16.0d)) * 16;
                            int ceil2 = ((int) Math.ceil((ceil / 2) / 16.0d)) * 16;
                            int i5 = c176877tj2.A01;
                            i2 = (ceil * i5) + (((ceil2 * i5) / 2) * 2);
                        }
                        int i6 = i2 / 8;
                        ArrayList arrayList = this.A04;
                        if (!arrayList.isEmpty()) {
                            if (((byte[]) arrayList.get(0)).length != i6) {
                                arrayList.clear();
                            }
                            int size = arrayList.size();
                            if (i4 > size) {
                                int i7 = i4 - size;
                                while (i3 < i7) {
                                    arrayList.add(new byte[i6]);
                                    i3++;
                                }
                            } else if (i4 < size) {
                                ArrayList A17 = AbstractC25225BEi.A17(i4);
                                while (i3 < i4) {
                                    A17.add((byte[]) arrayList.get(i3));
                                    i3++;
                                }
                                arrayList.clear();
                                arrayList.addAll(A17);
                            }
                        } else {
                            while (i3 < i4) {
                                arrayList.add(new byte[i6]);
                                i3++;
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            camera.addCallbackBuffer((byte[]) it.next());
                        }
                        camera.setPreviewCallbackWithBuffer(this.A07);
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    camera.setPreviewCallbackWithBuffer(null);
                    camera.setPreviewCallback(this.A06);
                }
                this.A02 = true;
            }
        } else {
            throw AbstractC166987dD.A18("Cannot enable listeners on the UI thread");
        }
    }
}

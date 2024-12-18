package X;

import android.view.View;
import com.instagram.ui.widget.mediapicker.MediaPickerItemView;

/* loaded from: classes8.dex */
public final class LQL implements View.OnLongClickListener {
    public final int A00;
    public final Object A01;

    public LQL(LKK lkk, int i) {
        this.A00 = i;
        this.A01 = lkk;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        MediaPickerItemView mediaPickerItemView;
        InterfaceC16820sZ interfaceC16820sZ;
        String str;
        switch (this.A00) {
            case 0:
                mediaPickerItemView = (MediaPickerItemView) this.A01;
                interfaceC16820sZ = C50186MEn.A00;
                break;
            case 1:
                C26610Bp7 c26610Bp7 = (C26610Bp7) this.A01;
                C25814BbV c25814BbV = c26610Bp7.A02;
                if (c25814BbV != null) {
                    c25814BbV.A0O(c26610Bp7.A01);
                    return true;
                }
                return true;
            case 2:
                mediaPickerItemView = (MediaPickerItemView) this.A01;
                interfaceC16820sZ = MF2.A00;
                break;
            case 3:
                return C9V3.A00((C9V3) this.A01);
            case 4:
                X8O x8o = ((VBH) this.A01).A02;
                if (x8o != null) {
                    C159437De c159437De = ((WjB) x8o).A00;
                    C7F3 c7f3 = c159437De.A09;
                    String A00 = ((C7UD) c159437De.A0H.getValue()).A00();
                    VBH vbh = c159437De.A01;
                    if (vbh != null) {
                        str = vbh.getCurrentDecorAvatarPosition();
                    } else {
                        str = null;
                    }
                    c7f3.A0B(A00, str, "long");
                    return true;
                }
                return true;
            case 5:
            case 6:
            default:
                return false;
            case 7:
                C51375Mma c51375Mma = (C51375Mma) this.A01;
                OFZ ofz = c51375Mma.A02;
                ofz.getClass();
                String str2 = c51375Mma.A0C.A01;
                str2.getClass();
                ofz.A08.DeC(ofz.A0B, ofz.A00, str2);
                return true;
        }
        return AbstractC44294Jhk.A02(mediaPickerItemView, interfaceC16820sZ);
    }

    public LQL(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}

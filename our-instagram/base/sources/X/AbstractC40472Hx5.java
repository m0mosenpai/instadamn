package X;

import com.instagram.barcelona.creation.voiceclips.model.TranscriptionToken;
import com.instagram.feed.audio.AudioIntf;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Hx5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40472Hx5 {
    public static final C25996Bek A00(C38321qM c38321qM) {
        List list;
        Integer num;
        String str;
        Long l;
        AudioIntf Add = c38321qM.A0C.Add();
        C5Hc c5Hc = null;
        if (Add != null) {
            list = Add.CHJ();
        } else {
            list = null;
        }
        AudioIntf Add2 = c38321qM.A0C.Add();
        if (Add2 != null) {
            num = Add2.CHK();
        } else {
            num = null;
        }
        AudioIntf Add3 = c38321qM.A0C.Add();
        if (Add3 != null) {
            str = Add3.Ae1();
        } else {
            str = null;
        }
        AudioIntf Add4 = c38321qM.A0C.Add();
        if (Add4 != null) {
            l = Add4.Azh();
        } else {
            l = null;
        }
        if (list == null || num == null || str == null || l == null) {
            return null;
        }
        C5Hc A00 = AbstractC133095zb.A00(list);
        int intValue = num.intValue();
        int longValue = (int) l.longValue();
        String id = c38321qM.getId();
        if (id != null) {
            List<JL8> CAU = c38321qM.A0C.CAU();
            if (CAU != null) {
                ArrayList A0q = AbstractC167017dG.A0q(CAU);
                for (JL8 jl8 : CAU) {
                    A0q.add(new TranscriptionToken(jl8.getText(), jl8.BzY(), jl8.B1r(), false));
                }
                c5Hc = AbstractC133095zb.A00(A0q);
            }
            return new C25996Bek(str, id, A00, c5Hc, intValue, longValue);
        }
        throw AbstractC166997dE.A0g();
    }
}

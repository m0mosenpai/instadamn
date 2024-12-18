package X;

import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.api.schemas.NoteCustomThemeImpl;
import com.instagram.api.schemas.NoteEmojiReactionInfoIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class CUR {
    public User A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public List A0A;
    public List A0B;
    public NoteCustomTheme A0C;
    public final InterfaceC103524lS A0D;

    public final C103514lR A00() {
        NoteCustomThemeImpl noteCustomThemeImpl;
        ArrayList arrayList = null;
        C1DY A0b = AbstractC25235BEs.A0b(new C37761pD(null));
        Integer num = this.A03;
        Long l = this.A04;
        NoteCustomTheme noteCustomTheme = this.A0C;
        if (noteCustomTheme != null) {
            noteCustomThemeImpl = noteCustomTheme.ExJ();
        } else {
            noteCustomThemeImpl = null;
        }
        List list = this.A0A;
        Long l2 = this.A05;
        Boolean bool = this.A01;
        String str = this.A06;
        String str2 = this.A07;
        List list2 = this.A0B;
        if (list2 != null) {
            arrayList = AbstractC167017dG.A0q(list2);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((NoteEmojiReactionInfoIntf) it.next()).ExK(A0b));
            }
        }
        return new C103514lR(noteCustomThemeImpl, this.A00, bool, this.A02, num, l, l2, str, str2, this.A08, this.A09, list, arrayList);
    }

    public CUR(InterfaceC103524lS interfaceC103524lS) {
        this.A0D = interfaceC103524lS;
        this.A03 = interfaceC103524lS.AdU();
        this.A04 = interfaceC103524lS.Asa();
        this.A0C = interfaceC103524lS.AvO();
        this.A0A = interfaceC103524lS.B07();
        this.A05 = interfaceC103524lS.B3C();
        this.A01 = interfaceC103524lS.BCr();
        this.A06 = interfaceC103524lS.getId();
        this.A07 = interfaceC103524lS.getMediaId();
        this.A0B = interfaceC103524lS.Bkk();
        this.A08 = interfaceC103524lS.getText();
        this.A00 = interfaceC103524lS.CDj();
        this.A09 = interfaceC103524lS.getUserId();
        this.A02 = interfaceC103524lS.CG8();
    }
}

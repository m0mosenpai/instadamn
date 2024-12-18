package X;

import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ImmutablePandoNoteCustomTheme;
import com.instagram.api.schemas.ImmutablePandoNoteEmojiReactionInfo;
import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.api.schemas.NoteCustomThemeImpl;
import com.instagram.api.schemas.NoteEmojiReactionInfoIntf;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.C0t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27253C0t extends C17T implements InterfaceC103524lS {
    public User A00;
    public List A01;
    public List A02;

    private final List A01(C1DY c1dy) {
        ImmutableList A08 = A08(486741610, ImmutablePandoUserDict.class);
        if (A08 != null) {
            ArrayList A0q = AbstractC167017dG.A0q(A08);
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) it.next();
                Parcelable.Creator creator = User.CREATOR;
                C14360o3.A0A(immutablePandoUserDict);
                A0q.add(AbstractC38851rI.A01(c1dy, immutablePandoUserDict));
            }
            return A0q;
        }
        return null;
    }

    @Override // X.InterfaceC103524lS
    public final /* synthetic */ CUR AKP() {
        return new CUR(this);
    }

    @Override // X.InterfaceC103524lS
    public final NoteCustomTheme AvO() {
        return (NoteCustomTheme) A05(731007867, ImmutablePandoNoteCustomTheme.class);
    }

    @Override // X.InterfaceC103524lS
    public final List Bkk() {
        List list = this.A02;
        if (list == null) {
            return A08(-1122997398, ImmutablePandoNoteEmojiReactionInfo.class);
        }
        return list;
    }

    @Override // X.InterfaceC103524lS
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, CDL.A00(this));
    }

    @Override // X.InterfaceC103524lS
    public final Integer AdU() {
        return getOptionalIntValueByHashCode(975628804);
    }

    @Override // X.InterfaceC103524lS
    public final Long Asa() {
        return A0L(1369680106);
    }

    @Override // X.InterfaceC103524lS
    public final List B07() {
        return this.A01;
    }

    @Override // X.InterfaceC103524lS
    public final Long B3C() {
        return A0L(-833811170);
    }

    @Override // X.InterfaceC103524lS
    public final Boolean BCr() {
        return getOptionalBooleanValueByHashCode(-1472279412);
    }

    @Override // X.InterfaceC103524lS
    public final User CDj() {
        return this.A00;
    }

    @Override // X.InterfaceC103524lS
    public final Boolean CG8() {
        return getOptionalBooleanValueByHashCode(-778200101);
    }

    @Override // X.InterfaceC103524lS
    public final InterfaceC103524lS E9C(C1DY c1dy) {
        ArrayList arrayList;
        User user;
        this.A01 = A01(c1dy);
        List<NoteEmojiReactionInfoIntf> Bkk = Bkk();
        if (Bkk != null) {
            arrayList = AbstractC167017dG.A0q(Bkk);
            for (NoteEmojiReactionInfoIntf noteEmojiReactionInfoIntf : Bkk) {
                noteEmojiReactionInfoIntf.E9S(c1dy);
                arrayList.add(noteEmojiReactionInfoIntf);
            }
        } else {
            arrayList = null;
        }
        this.A02 = arrayList;
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) A07(ImmutablePandoUserDict.class);
        if (immutablePandoUserDict != null) {
            Parcelable.Creator creator = User.CREATOR;
            user = AbstractC38851rI.A01(c1dy, immutablePandoUserDict);
        } else {
            user = null;
        }
        this.A00 = user;
        return this;
    }

    @Override // X.InterfaceC103524lS
    public final C103514lR EwL(C1DY c1dy) {
        NoteCustomThemeImpl noteCustomThemeImpl;
        ArrayList arrayList;
        ArrayList arrayList2;
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(975628804);
        Long A0L = A0L(1369680106);
        NoteCustomTheme AvO = AvO();
        User user = null;
        if (AvO != null) {
            noteCustomThemeImpl = AvO.ExJ();
        } else {
            noteCustomThemeImpl = null;
        }
        List A01 = A01(c1dy);
        if (A01 != null) {
            arrayList = AbstractC167007dF.A0i(A01);
            Iterator it = A01.iterator();
            while (it.hasNext()) {
                arrayList.add(c1dy.A00(AbstractC25226BEj.A15(it)));
            }
        } else {
            arrayList = null;
        }
        Long A0L2 = A0L(-833811170);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-1472279412);
        String A0e = A0e();
        String A0f = A0f();
        List Bkk = Bkk();
        if (Bkk != null) {
            arrayList2 = AbstractC167007dF.A0i(Bkk);
            Iterator it2 = Bkk.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((NoteEmojiReactionInfoIntf) it2.next()).ExK(c1dy));
            }
        } else {
            arrayList2 = null;
        }
        String A0X = A0X();
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) A07(ImmutablePandoUserDict.class);
        if (immutablePandoUserDict != null) {
            Parcelable.Creator creator = User.CREATOR;
            User A012 = AbstractC38851rI.A01(c1dy, immutablePandoUserDict);
            if (A012 != null) {
                user = (User) c1dy.A00(A012);
            }
        }
        return new C103514lR(noteCustomThemeImpl, user, optionalBooleanValueByHashCode, getOptionalBooleanValueByHashCode(-778200101), optionalIntValueByHashCode, A0L, A0L2, A0e, A0f, A0X, A0j(-147132913), arrayList, arrayList2);
    }

    @Override // X.InterfaceC103524lS
    public final String getId() {
        return A0e();
    }

    @Override // X.InterfaceC103524lS
    public final String getMediaId() {
        return A0f();
    }

    @Override // X.InterfaceC103524lS
    public final String getText() {
        return A0X();
    }

    @Override // X.InterfaceC103524lS
    public final String getUserId() {
        return A0j(-147132913);
    }
}

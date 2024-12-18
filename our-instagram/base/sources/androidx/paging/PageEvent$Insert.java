package androidx.paging;

import X.AbstractC001800i;
import X.AbstractC16490ru;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25230BEn;
import X.AbstractC31172DnG;
import X.AbstractC43593JPy;
import X.AbstractC50522MSa;
import X.AbstractC53628NnZ;
import X.AnonymousClass001;
import X.C14360o3;
import X.C51057MhB;
import X.C55090Oaw;
import X.EnumC53109NeM;
import X.OX8;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class PageEvent$Insert extends AbstractC53628NnZ {
    public static final PageEvent$Insert A06;
    public final int A00;
    public final int A01;
    public final OX8 A02;
    public final OX8 A03;
    public final EnumC53109NeM A04;
    public final List A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PageEvent$Insert) {
                PageEvent$Insert pageEvent$Insert = (PageEvent$Insert) obj;
                if (this.A04 != pageEvent$Insert.A04 || !C14360o3.A0K(this.A05, pageEvent$Insert.A05) || this.A01 != pageEvent$Insert.A01 || this.A00 != pageEvent$Insert.A00 || !C14360o3.A0K(this.A03, pageEvent$Insert.A03) || !C14360o3.A0K(this.A02, pageEvent$Insert.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        List A1J = AbstractC166987dD.A1J(C55090Oaw.A04);
        C51057MhB c51057MhB = C51057MhB.A01;
        C51057MhB c51057MhB2 = C51057MhB.A00;
        OX8 ox8 = new OX8(c51057MhB, c51057MhB2, c51057MhB2);
        boolean A1b = AbstractC43593JPy.A1b(ox8);
        A06 = new PageEvent$Insert(ox8, null, EnumC53109NeM.REFRESH, A1J, A1b ? 1 : 0, A1b ? 1 : 0);
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A03, (((AbstractC166997dE.A0J(this.A05, AbstractC166987dD.A0G(this.A04)) + this.A01) * 31) + this.A00) * 31) + AbstractC167017dG.A0M(this.A02);
    }

    public final String toString() {
        String str;
        Object obj;
        List list = this.A05;
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = AbstractC31172DnG.A02(((C55090Oaw) it.next()).A01, i);
        }
        int i2 = this.A01;
        String str2 = NetInfoModule.CONNECTION_TYPE_NONE;
        if (i2 != -1) {
            str = String.valueOf(i2);
        } else {
            str = NetInfoModule.CONNECTION_TYPE_NONE;
        }
        int i3 = this.A00;
        if (i3 != -1) {
            str2 = String.valueOf(i3);
        }
        OX8 ox8 = this.A02;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PageEvent.Insert for ");
        A1C.append(this.A04);
        A1C.append(", with ");
        A1C.append(i);
        A1C.append(" items (\n                    |   first item: ");
        C55090Oaw c55090Oaw = (C55090Oaw) AbstractC001800i.A0J(list);
        Object obj2 = null;
        if (c55090Oaw != null) {
            obj = AbstractC001800i.A0J(c55090Oaw.A01);
        } else {
            obj = null;
        }
        A1C.append(obj);
        A1C.append("\n                    |   last item: ");
        C55090Oaw c55090Oaw2 = (C55090Oaw) AbstractC001800i.A0L(list);
        if (c55090Oaw2 != null) {
            obj2 = AbstractC001800i.A0L(c55090Oaw2.A01);
        }
        A1C.append(obj2);
        A1C.append("\n                    |   placeholdersBefore: ");
        A1C.append(str);
        A1C.append("\n                    |   placeholdersAfter: ");
        A1C.append(str2);
        A1C.append("\n                    |   sourceLoadStates: ");
        A1C.append(this.A03);
        return AbstractC16490ru.A0q(AnonymousClass001.A0R(AbstractC50522MSa.A0l(ox8, "\n                    ", A1C), "|)"), "|");
    }

    public PageEvent$Insert(OX8 ox8, OX8 ox82, EnumC53109NeM enumC53109NeM, List list, int i, int i2) {
        this.A04 = enumC53109NeM;
        this.A05 = list;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = ox8;
        this.A02 = ox82;
        if (enumC53109NeM != EnumC53109NeM.APPEND && i < 0) {
            throw AbstractC25230BEn.A0n("Prepend insert defining placeholdersBefore must be > 0, but was ", i);
        }
        if (enumC53109NeM != EnumC53109NeM.PREPEND && i2 < 0) {
            throw AbstractC25230BEn.A0n("Append insert defining placeholdersAfter must be > 0, but was ", i2);
        }
        if (enumC53109NeM == EnumC53109NeM.REFRESH && !AbstractC166987dD.A1b(list)) {
            throw AbstractC166987dD.A12("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
        }
    }
}

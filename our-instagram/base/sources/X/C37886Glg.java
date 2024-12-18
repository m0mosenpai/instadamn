package X;

import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.model.people.PeopleTag;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.Glg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37886Glg extends C37525Gfh {
    public final ReentrantReadWriteLock A00;

    public static ReentrantReadWriteLock A01(C37886Glg c37886Glg, Object obj) {
        C14360o3.A0B(obj, 0);
        return c37886Glg.A00;
    }

    @Override // X.C37525Gfh, X.AbstractC37552Gg8
    public final int A0C(C120985dq c120985dq) {
        C14360o3.A0B(c120985dq, 0);
        ReentrantReadWriteLock.ReadLock readLock = this.A00.readLock();
        readLock.lock();
        try {
            return super.A0C(c120985dq);
        } finally {
            readLock.unlock();
        }
    }

    @Override // X.AbstractC37552Gg8
    /* renamed from: A0H */
    public final C5qT BAM(C120985dq c120985dq) {
        C14360o3.A0B(c120985dq, 0);
        ReentrantReadWriteLock.ReadLock readLock = this.A00.readLock();
        readLock.lock();
        try {
            return super.BAM(c120985dq);
        } finally {
            readLock.unlock();
        }
    }

    @Override // X.C37525Gfh, X.AbstractC37552Gg8
    public final List A0L(EnumC129395t1 enumC129395t1) {
        C14360o3.A0B(enumC129395t1, 0);
        ReentrantReadWriteLock.ReadLock A09 = AbstractC37552Gg8.A09(this);
        try {
            return super.A0L(enumC129395t1);
        } finally {
            A09.unlock();
        }
    }

    @Override // X.C37525Gfh, X.AbstractC37552Gg8
    public final void A0U(C120985dq c120985dq, boolean z) {
        int i;
        ReentrantReadWriteLock A01 = A01(this, c120985dq);
        ReentrantReadWriteLock.ReadLock readLock = A01.readLock();
        int i2 = 0;
        if (A01.getWriteHoldCount() == 0) {
            i = A01.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(A01);
        try {
            super.A0U(c120985dq, true);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.AbstractC37552Gg8
    public final boolean A0b(C120985dq c120985dq) {
        C14360o3.A0B(c120985dq, 0);
        ReentrantReadWriteLock.ReadLock A09 = AbstractC37552Gg8.A09(this);
        try {
            return super.A0b(c120985dq);
        } finally {
            A09.unlock();
        }
    }

    @Override // X.C37525Gfh, X.AbstractC39459Hbl
    public final void A0g(C120985dq c120985dq, boolean z) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.A0g(c120985dq, true);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.AbstractC39459Hbl
    public final void A0h(C120985dq c120985dq, boolean z) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.A0h(c120985dq, true);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC61782rf
    public final C75113Zb BRZ(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        ReentrantReadWriteLock.ReadLock A09 = AbstractC37552Gg8.A09(this);
        try {
            return super.BRZ(c38321qM);
        } finally {
            A09.unlock();
        }
    }

    @Override // X.C37525Gfh, X.JPb
    public final C37644Ghd C09(C120985dq c120985dq) {
        C14360o3.A0B(c120985dq, 0);
        ReentrantReadWriteLock.ReadLock readLock = this.A00.readLock();
        readLock.lock();
        try {
            return super.C09(c120985dq);
        } finally {
            readLock.unlock();
        }
    }

    @Override // X.C37525Gfh, X.JPb
    public final List C0A(C120985dq c120985dq) {
        C14360o3.A0B(c120985dq, 0);
        ReentrantReadWriteLock.ReadLock A09 = AbstractC37552Gg8.A09(this);
        try {
            return super.C0A(c120985dq);
        } finally {
            A09.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC31077DlK
    public final void EVG(C120985dq c120985dq, boolean z) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.EVG(c120985dq, true);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC31077DlK
    public final void EWM(C120985dq c120985dq, boolean z) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.EWM(c120985dq, true);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC31077DlK
    public final void Ea3(C120985dq c120985dq, boolean z) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.Ea3(c120985dq, true);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC31077DlK
    public final void Ecj(C120985dq c120985dq, EnumC75193Zm enumC75193Zm) {
        int i;
        C14360o3.A0B(enumC75193Zm, 1);
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.Ecj(c120985dq, enumC75193Zm);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC31077DlK
    public final void Edn(C120985dq c120985dq, EnumC39535Hd6 enumC39535Hd6) {
        int i;
        C14360o3.A0B(enumC39535Hd6, 1);
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.Edn(c120985dq, enumC39535Hd6);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC31077DlK
    public final void Ee8(C120985dq c120985dq, boolean z) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.Ee8(c120985dq, false);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.AbstractC37552Gg8
    public final int A0B() {
        ReentrantReadWriteLock.ReadLock readLock = this.A00.readLock();
        readLock.lock();
        try {
            return super.A0B();
        } finally {
            readLock.unlock();
        }
    }

    @Override // X.C37525Gfh, X.AbstractC37552Gg8
    public final C120985dq A0F(int i) {
        ReentrantReadWriteLock.ReadLock readLock = this.A00.readLock();
        readLock.lock();
        try {
            return super.A0F(i);
        } finally {
            readLock.unlock();
        }
    }

    @Override // X.C37525Gfh, X.AbstractC37552Gg8
    public final C120985dq A0G(int i) {
        ReentrantReadWriteLock.ReadLock readLock = this.A00.readLock();
        readLock.lock();
        try {
            return super.A0G(i);
        } finally {
            readLock.unlock();
        }
    }

    @Override // X.C37525Gfh, X.AbstractC37552Gg8
    public final List A0J() {
        ReentrantReadWriteLock.ReadLock readLock = this.A00.readLock();
        readLock.lock();
        try {
            return super.A0J();
        } finally {
            readLock.unlock();
        }
    }

    @Override // X.C37525Gfh, X.AbstractC37552Gg8
    public final List A0K(int i, int i2) {
        int i3;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i4 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i3 = reentrantReadWriteLock.getReadHoldCount();
        } else {
            i3 = 0;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            return super.A0K(i, i2);
        } finally {
            while (i4 < i3) {
                readLock.lock();
                i4++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.AbstractC37552Gg8
    public final void A0M() {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.A0M();
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.AbstractC37552Gg8
    public final void A0O() {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.A0O();
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.AbstractC37552Gg8
    public final void A0P(int i, List list) {
        int i2;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i3 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i2 = reentrantReadWriteLock.getReadHoldCount();
            for (int i4 = 0; i4 < i2; i4++) {
                readLock.unlock();
            }
        } else {
            i2 = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.A0P(i, list);
        } finally {
            while (i3 < i2) {
                readLock.lock();
                i3++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.AbstractC37552Gg8
    public final void A0R(C120985dq c120985dq, int i) {
        int i2;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i3 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i2 = reentrantReadWriteLock.getReadHoldCount();
            for (int i4 = 0; i4 < i2; i4++) {
                readLock.unlock();
            }
        } else {
            i2 = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.A0R(c120985dq, i);
        } finally {
            while (i3 < i2) {
                readLock.lock();
                i3++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.AbstractC37552Gg8
    public final void A0T(C120985dq c120985dq, PeopleTag peopleTag) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.A0T(c120985dq, peopleTag);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.AbstractC37552Gg8
    public final void A0V(String str, int i) {
        int i2;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i3 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i2 = reentrantReadWriteLock.getReadHoldCount();
            for (int i4 = 0; i4 < i2; i4++) {
                readLock.unlock();
            }
        } else {
            i2 = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.A0V(str, i);
        } finally {
            while (i3 < i2) {
                readLock.lock();
                i3++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.AbstractC37552Gg8
    public final void A0W(List list) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.A0W(list);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.AbstractC37552Gg8
    public final void A0X(List list) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.A0X(list);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.AbstractC37552Gg8
    public final void A0Y(boolean z) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.A0Y(z);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.AbstractC37552Gg8
    public final boolean A0c(C120985dq c120985dq, int i) {
        int i2;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i3 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i2 = reentrantReadWriteLock.getReadHoldCount();
            for (int i4 = 0; i4 < i2; i4++) {
                readLock.unlock();
            }
        } else {
            i2 = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            return super.A0c(c120985dq, i);
        } finally {
            while (i3 < i2) {
                readLock.lock();
                i3++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC31077DlK
    public final void CNF(C120985dq c120985dq) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.CNF(c120985dq);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC31077DlK
    public final void ERE(C120985dq c120985dq, Integer num) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.ERE(c120985dq, num);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC31077DlK
    public final void ERn(C45127Jxw c45127Jxw, C120985dq c120985dq) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.ERn(c45127Jxw, c120985dq);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC31077DlK
    public final void ETD(C120985dq c120985dq, String str) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.ETD(c120985dq, str);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC31077DlK
    public final void EUB(C120985dq c120985dq, C09530e4 c09530e4) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.EUB(c120985dq, c09530e4);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC31077DlK
    public final void EUw(C120985dq c120985dq, int i) {
        int i2;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i3 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i2 = reentrantReadWriteLock.getReadHoldCount();
            for (int i4 = 0; i4 < i2; i4++) {
                readLock.unlock();
            }
        } else {
            i2 = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.EUw(c120985dq, i);
        } finally {
            while (i3 < i2) {
                readLock.lock();
                i3++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC31077DlK
    public final void EUx(C120985dq c120985dq, int i) {
        int i2;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i3 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i2 = reentrantReadWriteLock.getReadHoldCount();
            for (int i4 = 0; i4 < i2; i4++) {
                readLock.unlock();
            }
        } else {
            i2 = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.EUx(c120985dq, i);
        } finally {
            while (i3 < i2) {
                readLock.lock();
                i3++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC31077DlK
    public final void EUz(C120985dq c120985dq, int i) {
        int i2;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i3 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i2 = reentrantReadWriteLock.getReadHoldCount();
            for (int i4 = 0; i4 < i2; i4++) {
                readLock.unlock();
            }
        } else {
            i2 = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.EUz(c120985dq, i);
        } finally {
            while (i3 < i2) {
                readLock.lock();
                i3++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC31077DlK
    public final void EV0(C120985dq c120985dq, int i) {
        int i2;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i3 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i2 = reentrantReadWriteLock.getReadHoldCount();
            for (int i4 = 0; i4 < i2; i4++) {
                readLock.unlock();
            }
        } else {
            i2 = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.EV0(c120985dq, i);
        } finally {
            while (i3 < i2) {
                readLock.lock();
                i3++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC31077DlK
    public final void EV1(C120985dq c120985dq, int i) {
        int i2;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i3 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i2 = reentrantReadWriteLock.getReadHoldCount();
            for (int i4 = 0; i4 < i2; i4++) {
                readLock.unlock();
            }
        } else {
            i2 = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.EV1(c120985dq, i);
        } finally {
            while (i3 < i2) {
                readLock.lock();
                i3++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC31077DlK
    public final void EWQ(C120985dq c120985dq, boolean z) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.EWQ(c120985dq, z);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC31077DlK
    public final void EWb(C120985dq c120985dq, boolean z) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.EWb(c120985dq, z);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC31077DlK
    public final void EWe(C120985dq c120985dq, boolean z) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.EWe(c120985dq, z);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC31077DlK
    public final void EWf(C120985dq c120985dq, boolean z) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.EWf(c120985dq, z);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC31077DlK
    public final void EWj(C120985dq c120985dq, boolean z) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.EWj(c120985dq, z);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC31077DlK
    public final void EWy(C120985dq c120985dq, Integer num) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.EWy(c120985dq, num);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC31077DlK
    public final void Ee5(C120985dq c120985dq, boolean z) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.Ee5(c120985dq, z);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC31077DlK
    public final void Ee6(C120985dq c120985dq, boolean z) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.Ee6(c120985dq, z);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC31077DlK
    public final void Ee7(C120985dq c120985dq, boolean z) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.Ee7(c120985dq, z);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC31077DlK
    public final void Ee9(C120985dq c120985dq, boolean z) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.Ee9(c120985dq, z);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC31077DlK
    public final void EeB(C120985dq c120985dq, boolean z) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            super.EeB(c120985dq, z);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    public final String toString() {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A00;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
        try {
            return super.toString();
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37886Glg(ClipsViewerSource clipsViewerSource, UserSession userSession, boolean z) {
        super(clipsViewerSource, userSession, z);
        AbstractC167017dG.A1P(userSession, clipsViewerSource);
        this.A00 = new ReentrantReadWriteLock();
    }

    @Override // X.C37525Gfh, X.AbstractC37552Gg8
    public final int A0D(C38321qM c38321qM) {
        ReentrantReadWriteLock.ReadLock A09 = AbstractC37552Gg8.A09(this);
        try {
            return super.A0D(c38321qM);
        } finally {
            A09.unlock();
        }
    }

    @Override // X.C37525Gfh, X.AbstractC37552Gg8
    public final void A0S(C120985dq c120985dq, C120985dq c120985dq2) {
        int i;
        ReentrantReadWriteLock A01 = A01(this, c120985dq);
        ReentrantReadWriteLock.ReadLock readLock = A01.readLock();
        int i2 = 0;
        if (A01.getWriteHoldCount() == 0) {
            i = A01.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(A01);
        try {
            super.A0S(c120985dq, c120985dq2);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.AbstractC37552Gg8
    public final boolean A0a() {
        ReentrantReadWriteLock.ReadLock A09 = AbstractC37552Gg8.A09(this);
        try {
            return super.A0a();
        } finally {
            A09.unlock();
        }
    }

    @Override // X.C37525Gfh, X.AbstractC39459Hbl
    public final List A0e(java.util.Set set) {
        ReentrantReadWriteLock.ReadLock A09 = AbstractC37552Gg8.A09(this);
        try {
            return super.A0e(set);
        } finally {
            A09.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC31077DlK
    public final void ERo(C120985dq c120985dq, boolean z) {
        int i;
        ReentrantReadWriteLock A01 = A01(this, c120985dq);
        ReentrantReadWriteLock.ReadLock readLock = A01.readLock();
        int i2 = 0;
        if (A01.getWriteHoldCount() == 0) {
            i = A01.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(A01);
        try {
            super.ERo(c120985dq, z);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC31077DlK
    public final void EWO(C120985dq c120985dq, boolean z) {
        int i;
        ReentrantReadWriteLock A01 = A01(this, c120985dq);
        ReentrantReadWriteLock.ReadLock readLock = A01.readLock();
        int i2 = 0;
        if (A01.getWriteHoldCount() == 0) {
            i = A01.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(A01);
        try {
            super.EWO(c120985dq, z);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC31077DlK
    public final void EWT(C120985dq c120985dq, boolean z) {
        int i;
        ReentrantReadWriteLock A01 = A01(this, c120985dq);
        ReentrantReadWriteLock.ReadLock readLock = A01.readLock();
        int i2 = 0;
        if (A01.getWriteHoldCount() == 0) {
            i = A01.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(A01);
        try {
            super.EWT(c120985dq, z);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC31077DlK
    public final void EWU(C120985dq c120985dq, boolean z) {
        int i;
        ReentrantReadWriteLock A01 = A01(this, c120985dq);
        ReentrantReadWriteLock.ReadLock readLock = A01.readLock();
        int i2 = 0;
        if (A01.getWriteHoldCount() == 0) {
            i = A01.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(A01);
        try {
            super.EWU(c120985dq, z);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.AbstractC37552Gg8, X.XLO
    public final void EWn(C07X c07x, MTQ mtq) {
        int i;
        ReentrantReadWriteLock A01 = A01(this, mtq);
        ReentrantReadWriteLock.ReadLock readLock = A01.readLock();
        int i2 = 0;
        if (A01.getWriteHoldCount() == 0) {
            i = A01.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(A01);
        try {
            super.EWn(c07x, mtq);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC31077DlK
    public final void EX0(C120985dq c120985dq, Integer num) {
        int i;
        ReentrantReadWriteLock A01 = A01(this, c120985dq);
        ReentrantReadWriteLock.ReadLock readLock = A01.readLock();
        int i2 = 0;
        if (A01.getWriteHoldCount() == 0) {
            i = A01.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(A01);
        try {
            super.EX0(c120985dq, num);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    @Override // X.C37525Gfh, X.InterfaceC31077DlK
    public final void EcV(C120985dq c120985dq, EnumC39550HdM enumC39550HdM) {
        int i;
        ReentrantReadWriteLock A01 = A01(this, c120985dq);
        ReentrantReadWriteLock.ReadLock readLock = A01.readLock();
        int i2 = 0;
        if (A01.getWriteHoldCount() == 0) {
            i = A01.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(A01);
        try {
            super.EcV(c120985dq, enumC39550HdM);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0A.unlock();
        }
    }

    public final boolean equals(Object obj) {
        ReentrantReadWriteLock.ReadLock A09 = AbstractC37552Gg8.A09(this);
        try {
            return super.equals(obj);
        } finally {
            A09.unlock();
        }
    }

    public final int hashCode() {
        ReentrantReadWriteLock.ReadLock A09 = AbstractC37552Gg8.A09(this);
        try {
            return super.hashCode();
        } finally {
            A09.unlock();
        }
    }
}

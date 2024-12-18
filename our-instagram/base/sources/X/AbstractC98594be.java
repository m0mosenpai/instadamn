package X;

import java.util.ArrayDeque;

/* renamed from: X.4be, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC98594be implements InterfaceC98604bf {
    public int A00;
    public int A01;
    public int A02;
    public C4YB A03;
    public boolean A04;
    public boolean A05;
    public C96094Ts A06;
    public final Object A07 = new Object();
    public final ArrayDeque A08 = new ArrayDeque();
    public final ArrayDeque A09 = new ArrayDeque();
    public final C96094Ts[] A0A;
    public final AbstractC117285Sn[] A0B;
    public final Thread A0C;

    public abstract C96094Ts createInputBuffer();

    public abstract AbstractC117285Sn createOutputBuffer();

    public abstract C4YB createUnexpectedDecodeException(Throwable th);

    public abstract C4YB decode(C96094Ts c96094Ts, AbstractC117285Sn abstractC117285Sn, boolean z);

    @Override // X.InterfaceC98604bf
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C96094Ts AOr() {
        C96094Ts c96094Ts;
        synchronized (this.A07) {
            C4YB c4yb = this.A03;
            if (c4yb == null) {
                boolean z = false;
                if (this.A06 == null) {
                    z = true;
                }
                C4B8.A04(z);
                int i = this.A00;
                if (i == 0) {
                    c96094Ts = null;
                } else {
                    C96094Ts[] c96094TsArr = this.A0A;
                    int i2 = i - 1;
                    this.A00 = i2;
                    c96094Ts = c96094TsArr[i2];
                }
                this.A06 = c96094Ts;
            } else {
                throw c4yb;
            }
        }
        return c96094Ts;
    }

    @Override // X.InterfaceC98604bf
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final AbstractC117285Sn AOu() {
        AbstractC117285Sn abstractC117285Sn;
        synchronized (this.A07) {
            C4YB c4yb = this.A03;
            if (c4yb == null) {
                ArrayDeque arrayDeque = this.A09;
                if (arrayDeque.isEmpty()) {
                    abstractC117285Sn = null;
                } else {
                    abstractC117285Sn = (AbstractC117285Sn) arrayDeque.removeFirst();
                }
            } else {
                throw c4yb;
            }
        }
        return abstractC117285Sn;
    }

    public final void A03(int i) {
        int i2 = this.A00;
        C96094Ts[] c96094TsArr = this.A0A;
        boolean z = false;
        if (i2 == c96094TsArr.length) {
            z = true;
        }
        C4B8.A04(z);
        for (C96094Ts c96094Ts : c96094TsArr) {
            c96094Ts.A01(i);
        }
    }

    @Override // X.InterfaceC98604bf
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final void E7b(C96094Ts c96094Ts) {
        Object obj = this.A07;
        synchronized (obj) {
            C4YB c4yb = this.A03;
            if (c4yb == null) {
                boolean z = false;
                if (c96094Ts == this.A06) {
                    z = true;
                }
                C4B8.A03(z);
                ArrayDeque arrayDeque = this.A08;
                arrayDeque.addLast(c96094Ts);
                if (!arrayDeque.isEmpty() && this.A01 > 0) {
                    obj.notify();
                }
                this.A06 = null;
            } else {
                throw c4yb;
            }
        }
    }

    public final void A05(AbstractC117285Sn abstractC117285Sn) {
        Object obj = this.A07;
        synchronized (obj) {
            abstractC117285Sn.clear();
            AbstractC117285Sn[] abstractC117285SnArr = this.A0B;
            int i = this.A01;
            this.A01 = i + 1;
            abstractC117285SnArr[i] = abstractC117285Sn;
            if (!this.A08.isEmpty() && this.A01 > 0) {
                obj.notify();
            }
        }
    }

    @Override // X.InterfaceC98604bf
    public final void flush() {
        synchronized (this.A07) {
            this.A04 = true;
            this.A02 = 0;
            C96094Ts c96094Ts = this.A06;
            if (c96094Ts != null) {
                c96094Ts.clear();
                C96094Ts[] c96094TsArr = this.A0A;
                int i = this.A00;
                this.A00 = i + 1;
                c96094TsArr[i] = c96094Ts;
                this.A06 = null;
            }
            while (true) {
                ArrayDeque arrayDeque = this.A08;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                C96094Ts c96094Ts2 = (C96094Ts) arrayDeque.removeFirst();
                c96094Ts2.clear();
                C96094Ts[] c96094TsArr2 = this.A0A;
                int i2 = this.A00;
                this.A00 = i2 + 1;
                c96094TsArr2[i2] = c96094Ts2;
            }
            while (true) {
                ArrayDeque arrayDeque2 = this.A09;
                if (!arrayDeque2.isEmpty()) {
                    ((AbstractC117285Sn) arrayDeque2.removeFirst()).release();
                }
            }
        }
    }

    @Override // X.InterfaceC98604bf
    public void release() {
        Object obj = this.A07;
        synchronized (obj) {
            this.A05 = true;
            obj.notify();
        }
        try {
            this.A0C.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public AbstractC98594be(C96094Ts[] c96094TsArr, AbstractC117285Sn[] abstractC117285SnArr) {
        this.A0A = c96094TsArr;
        this.A00 = c96094TsArr.length;
        for (int i = 0; i < this.A00; i++) {
            this.A0A[i] = createInputBuffer();
        }
        this.A0B = abstractC117285SnArr;
        int length = abstractC117285SnArr.length;
        this.A01 = length;
        for (int i2 = 0; i2 < length; i2++) {
            abstractC117285SnArr[i2] = createOutputBuffer();
        }
        Thread thread = new Thread() { // from class: X.4bl
            {
                super("ExoPlayer:SimpleDecoder");
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                C4YB createUnexpectedDecodeException;
                AbstractC98594be abstractC98594be = AbstractC98594be.this;
                while (true) {
                    try {
                        Object obj = abstractC98594be.A07;
                        synchronized (obj) {
                            while (!abstractC98594be.A05 && (abstractC98594be.A08.isEmpty() || abstractC98594be.A01 <= 0)) {
                                try {
                                    obj.wait();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (!abstractC98594be.A05) {
                                C96094Ts c96094Ts = (C96094Ts) abstractC98594be.A08.removeFirst();
                                AbstractC117285Sn[] abstractC117285SnArr2 = abstractC98594be.A0B;
                                int i3 = abstractC98594be.A01 - 1;
                                abstractC98594be.A01 = i3;
                                AbstractC117285Sn abstractC117285Sn = abstractC117285SnArr2[i3];
                                boolean z = abstractC98594be.A04;
                                abstractC98594be.A04 = false;
                                int i4 = ((AbstractC96104Tt) c96094Ts).A00;
                                if ((i4 & 4) == 4) {
                                    ((AbstractC96104Tt) abstractC117285Sn).A00 |= 4;
                                } else {
                                    if ((i4 & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                                        ((AbstractC96104Tt) abstractC117285Sn).A00 = Integer.MIN_VALUE | ((AbstractC96104Tt) abstractC117285Sn).A00;
                                    }
                                    if ((((AbstractC96104Tt) c96094Ts).A00 & 134217728) == 134217728) {
                                        ((AbstractC96104Tt) abstractC117285Sn).A00 = 134217728 | ((AbstractC96104Tt) abstractC117285Sn).A00;
                                    }
                                    try {
                                        createUnexpectedDecodeException = abstractC98594be.decode(c96094Ts, abstractC117285Sn, z);
                                    } catch (OutOfMemoryError | RuntimeException e) {
                                        createUnexpectedDecodeException = abstractC98594be.createUnexpectedDecodeException(e);
                                    }
                                    if (createUnexpectedDecodeException != null) {
                                        synchronized (obj) {
                                            try {
                                                abstractC98594be.A03 = createUnexpectedDecodeException;
                                            } finally {
                                            }
                                        }
                                        return;
                                    }
                                }
                                synchronized (obj) {
                                    try {
                                        if (!abstractC98594be.A04) {
                                            if ((((AbstractC96104Tt) abstractC117285Sn).A00 & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                                                abstractC98594be.A02++;
                                            } else {
                                                abstractC98594be.A02 = 0;
                                                abstractC98594be.A09.addLast(abstractC117285Sn);
                                                c96094Ts.clear();
                                                C96094Ts[] c96094TsArr2 = abstractC98594be.A0A;
                                                int i5 = abstractC98594be.A00;
                                                abstractC98594be.A00 = i5 + 1;
                                                c96094TsArr2[i5] = c96094Ts;
                                            }
                                        }
                                        abstractC117285Sn.release();
                                        c96094Ts.clear();
                                        C96094Ts[] c96094TsArr22 = abstractC98594be.A0A;
                                        int i52 = abstractC98594be.A00;
                                        abstractC98594be.A00 = i52 + 1;
                                        c96094TsArr22[i52] = c96094Ts;
                                    } finally {
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                    } catch (InterruptedException e2) {
                        throw new IllegalStateException(e2);
                    }
                }
            }
        };
        this.A0C = thread;
        thread.start();
    }
}

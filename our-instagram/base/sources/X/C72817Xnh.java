package X;

import android.util.Pair;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.rsys.tslog.gen.TslogCounterApi;
import com.facebook.rsys.tslog.gen.TslogStreamApi;
import com.instagram.rtc.rsys.tslog.IgRadioTsLoggerEngine;

/* renamed from: X.Xnh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72817Xnh {
    public Pair A00;
    public C1EQ A01;
    public final TslogCounterApi A02;
    public final TslogCounterApi A03;
    public final TslogCounterApi A04;
    public final TslogCounterApi A05;
    public final TslogCounterApi A06;
    public final TslogCounterApi A07;
    public final TslogCounterApi A08;
    public final TslogCounterApi A09;
    public final TslogCounterApi A0A;
    public final TslogCounterApi A0B;
    public final /* synthetic */ IgRadioTsLoggerEngine A0C;

    public C72817Xnh(TslogStreamApi tslogStreamApi, IgRadioTsLoggerEngine igRadioTsLoggerEngine) {
        this.A0C = igRadioTsLoggerEngine;
        TslogCounterApi createCounter = tslogStreamApi.createCounter("cell_updates_count", 1);
        C14360o3.A07(createCounter);
        this.A08 = createCounter;
        TslogCounterApi createCounter2 = tslogStreamApi.createCounter(TraceFieldType.NetworkType, 4);
        C14360o3.A07(createCounter2);
        this.A09 = createCounter2;
        TslogCounterApi createCounter3 = tslogStreamApi.createCounter("cell_dbm", 4);
        C14360o3.A07(createCounter3);
        this.A03 = createCounter3;
        TslogCounterApi createCounter4 = tslogStreamApi.createCounter("cell_rsrp", 4);
        C14360o3.A07(createCounter4);
        this.A04 = createCounter4;
        TslogCounterApi createCounter5 = tslogStreamApi.createCounter("cell_rsrq", 4);
        C14360o3.A07(createCounter5);
        this.A05 = createCounter5;
        TslogCounterApi createCounter6 = tslogStreamApi.createCounter("cell_rssnr", 4);
        C14360o3.A07(createCounter6);
        this.A07 = createCounter6;
        TslogCounterApi createCounter7 = tslogStreamApi.createCounter("cell_rssi", 4);
        C14360o3.A07(createCounter7);
        this.A06 = createCounter7;
        TslogCounterApi createCounter8 = tslogStreamApi.createCounter("cell_cqi", 4);
        C14360o3.A07(createCounter8);
        this.A02 = createCounter8;
        TslogCounterApi createCounter9 = tslogStreamApi.createCounter("wifi_frequency", 4);
        C14360o3.A07(createCounter9);
        this.A0A = createCounter9;
        TslogCounterApi createCounter10 = tslogStreamApi.createCounter("wifi_rssi", 4);
        C14360o3.A07(createCounter10);
        this.A0B = createCounter10;
        this.A00 = AbstractC15820qc.A03(C18150uz.A0B.A01().A03());
    }
}

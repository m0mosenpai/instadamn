package com.instagram.debug.devoptions.section.localinjection;

import X.AbstractC001800i;
import X.AbstractC001900j;
import X.AbstractC13880nE;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC31174DnI;
import X.AbstractC31177DnL;
import X.AbstractC37303Gc4;
import X.AbstractC53242c7;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.C00O;
import X.C0f9;
import X.C0fQ;
import X.C14360o3;
import X.C16930sl;
import X.C1I4;
import X.C9GR;
import X.GZD;
import X.InterfaceC09390do;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.section.localinjection.InjectionMediaSelectionAdapter;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalInjectionUnit;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionDataStoreManager;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionFetcher;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.ui.widget.trianglespinner.TriangleSpinner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes11.dex */
public final class InjectMediaFragment extends AbstractC59962oe implements GZD, InjectionMediaSelectionAdapter.Delegate {
    public IgTextView clearAllButton;
    public LocalMediaInjectionConstants.InjectionContentType contentType;
    public LocalMediaInjectionDataStoreManager dataStoreManager;
    public LocalMediaInjectionController injectionController;
    public InjectionMediaSelectionAdapter injectionMediaSelectionAdapter;
    public List injectionUnits;
    public IgdsInlineSearchBox inlineSearchBox;
    public Set savedInjectedMedia;
    public View searchEmptyState;
    public TriangleSpinner surfaceSelector;
    public final InterfaceC09390do session$delegate = AbstractC60492pY.A02(this);
    public List options = C16930sl.A00;

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "inject_media_fragment";
    }

    @Override // com.instagram.debug.devoptions.section.localinjection.InjectionMediaSelectionAdapter.Delegate
    public void onItemSelectionChanged(Set set) {
        String str;
        C14360o3.A0B(set, 0);
        this.savedInjectedMedia = set;
        LocalMediaInjectionController localMediaInjectionController = this.injectionController;
        if (localMediaInjectionController == null) {
            str = "injectionController";
        } else {
            LocalMediaInjectionConstants.InjectionContentType injectionContentType = this.contentType;
            if (injectionContentType == null) {
                str = "contentType";
            } else {
                localMediaInjectionController.selectInjectionItems(set, injectionContentType);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.GZD
    public void onSearchCleared(String str) {
        C14360o3.A0B(str, 0);
        filterListWithQuery(str);
        IgdsInlineSearchBox igdsInlineSearchBox = this.inlineSearchBox;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.setVisibilityOfClearButton(false);
        }
    }

    @Override // X.GZD
    public void onSearchTextChanged(String str) {
        C14360o3.A0B(str, 0);
        filterListWithQuery(str);
        IgdsInlineSearchBox igdsInlineSearchBox = this.inlineSearchBox;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.setVisibilityOfClearButton(AbstractC167007dF.A1O(str.length()));
        }
    }

    private final void filterListWithQuery(String str) {
        int i;
        String str2;
        ArrayList arrayList = new ArrayList();
        String A0X = AbstractC37303Gc4.A0X(str);
        List list = this.injectionUnits;
        if (list == null) {
            str2 = "injectionUnits";
        } else {
            Iterator it = list.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                LocalInjectionUnit localInjectionUnit = (LocalInjectionUnit) it.next();
                if (AbstractC001900j.A0a(AbstractC37303Gc4.A0X(localInjectionUnit.unitName), A0X, false)) {
                    arrayList.add(localInjectionUnit);
                }
            }
            View view = this.searchEmptyState;
            if (view != null) {
                if (!arrayList.isEmpty()) {
                    i = 8;
                }
                view.setVisibility(i);
            }
            InjectionMediaSelectionAdapter injectionMediaSelectionAdapter = this.injectionMediaSelectionAdapter;
            if (injectionMediaSelectionAdapter == null) {
                str2 = "injectionMediaSelectionAdapter";
            } else {
                injectionMediaSelectionAdapter.updateList(arrayList);
                return;
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateList(TriangleSpinner triangleSpinner, IgTextView igTextView, IgdsInlineSearchBox igdsInlineSearchBox) {
        String str;
        LocalMediaInjectionConstants.InjectionContentType fromValue = LocalMediaInjectionConstants.InjectionContentType.Companion.fromValue(triangleSpinner.getSelectedItem().toString());
        if (fromValue != null) {
            this.contentType = fromValue;
            LocalMediaInjectionDataStoreManager fetchInjectionData = LocalMediaInjectionFetcher.fetchInjectionData(fromValue);
            this.dataStoreManager = fetchInjectionData;
            if (fetchInjectionData == null) {
                str = "dataStoreManager";
            } else {
                this.injectionUnits = fetchInjectionData.getAllInjectionItems();
                LocalMediaInjectionController localMediaInjectionController = this.injectionController;
                if (localMediaInjectionController == null) {
                    str = "injectionController";
                } else {
                    LocalMediaInjectionConstants.InjectionContentType injectionContentType = this.contentType;
                    if (injectionContentType != null) {
                        this.savedInjectedMedia = AbstractC001800i.A0j(localMediaInjectionController.getSelectedInjectionItems(injectionContentType));
                        List list = this.injectionUnits;
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (true) {
                                str = "savedInjectedMedia";
                                if (it.hasNext()) {
                                    LocalInjectionUnit localInjectionUnit = (LocalInjectionUnit) it.next();
                                    Set set = this.savedInjectedMedia;
                                    if (set == null) {
                                        break;
                                    } else {
                                        localInjectionUnit.isSelected = set.contains(localInjectionUnit.unitId);
                                    }
                                } else {
                                    InjectionMediaSelectionAdapter injectionMediaSelectionAdapter = this.injectionMediaSelectionAdapter;
                                    if (injectionMediaSelectionAdapter == null) {
                                        str = "injectionMediaSelectionAdapter";
                                    } else {
                                        List list2 = this.injectionUnits;
                                        if (list2 != null) {
                                            Set set2 = this.savedInjectedMedia;
                                            if (set2 != null) {
                                                injectionMediaSelectionAdapter.setMediaInjectionsList(list2, set2);
                                                filterListWithQuery(igdsInlineSearchBox.getSearchString());
                                                LocalMediaInjectionConstants.InjectionContentType injectionContentType2 = this.contentType;
                                                if (injectionContentType2 != null) {
                                                    AbstractC31177DnL.A10(igTextView, this, injectionContentType2.getValue(), 2131958171);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        C14360o3.A0F("injectionUnits");
                        throw C00O.createAndThrow();
                    }
                    C14360o3.A0F("contentType");
                    throw C00O.createAndThrow();
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC59962oe
    public UserSession getSession() {
        return (UserSession) this.session$delegate.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1849158973);
        super.onCreate(bundle);
        List<String> stringArrayList = requireArguments().getStringArrayList(LocalMediaInjectionConstants.CONTENT_TYPE_KEY);
        if (stringArrayList == null) {
            stringArrayList = C16930sl.A00;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : stringArrayList) {
            LocalMediaInjectionConstants.InjectionContentType.Companion companion = LocalMediaInjectionConstants.InjectionContentType.Companion;
            C14360o3.A0A(str);
            LocalMediaInjectionConstants.InjectionContentType fromValue = companion.fromValue(str);
            if (fromValue != null) {
                arrayList.add(fromValue);
            }
        }
        this.options = arrayList;
        C0f9.A09(-570446958, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-128012576);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.inject_media_fragment, viewGroup, false);
        this.searchEmptyState = inflate.requireViewById(R.id.injection_media_empty_state);
        Context requireContext = requireContext();
        List list = this.options;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(((LocalMediaInjectionConstants.InjectionContentType) it.next()).getValue());
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext, R.layout.inject_media_spinner_title, A0q);
        arrayAdapter.setDropDownViewResource(R.layout.inject_media_spinner_item);
        View requireViewById = inflate.requireViewById(R.id.surface_selection_spinner);
        final TriangleSpinner triangleSpinner = (TriangleSpinner) requireViewById;
        this.surfaceSelector = triangleSpinner;
        C14360o3.A07(requireViewById);
        triangleSpinner.setTriangleColor(requireContext().getColor(AbstractC53242c7.A08(getContext())));
        triangleSpinner.setAdapter((SpinnerAdapter) arrayAdapter);
        LocalMediaInjectionConstants.InjectionContentType fromValue = LocalMediaInjectionConstants.InjectionContentType.Companion.fromValue(triangleSpinner.getSelectedItem().toString());
        if (fromValue != null) {
            this.contentType = fromValue;
            String str = "contentType";
            this.dataStoreManager = LocalMediaInjectionFetcher.fetchInjectionData(fromValue);
            this.injectionController = new LocalMediaInjectionController(requireContext());
            LocalMediaInjectionDataStoreManager localMediaInjectionDataStoreManager = this.dataStoreManager;
            if (localMediaInjectionDataStoreManager == null) {
                str = "dataStoreManager";
            } else {
                this.injectionUnits = localMediaInjectionDataStoreManager.getAllInjectionItems();
                LocalMediaInjectionController localMediaInjectionController = this.injectionController;
                if (localMediaInjectionController == null) {
                    str = "injectionController";
                } else {
                    LocalMediaInjectionConstants.InjectionContentType injectionContentType = this.contentType;
                    if (injectionContentType != null) {
                        Set A0j = AbstractC001800i.A0j(localMediaInjectionController.getSelectedInjectionItems(injectionContentType));
                        this.savedInjectedMedia = A0j;
                        List list2 = this.injectionUnits;
                        if (list2 == null) {
                            str = "injectionUnits";
                        } else {
                            this.injectionMediaSelectionAdapter = new InjectionMediaSelectionAdapter(this, list2, A0j);
                            RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(inflate, R.id.injection_media_recycler_view);
                            InjectionMediaSelectionAdapter injectionMediaSelectionAdapter = this.injectionMediaSelectionAdapter;
                            if (injectionMediaSelectionAdapter == null) {
                                str = "injectionMediaSelectionAdapter";
                            } else {
                                recyclerView.setAdapter(injectionMediaSelectionAdapter);
                                recyclerView.A14(new C1I4() { // from class: com.instagram.debug.devoptions.section.localinjection.InjectMediaFragment$onCreateView$1
                                    @Override // X.C1I4
                                    public void onScrollStateChanged(RecyclerView recyclerView2, int i) {
                                        int A0N = AbstractC167017dG.A0N(recyclerView2, 976463603);
                                        super.onScrollStateChanged(recyclerView2, i);
                                        if (i == 1) {
                                            AbstractC13880nE.A0O(recyclerView2);
                                            recyclerView2.requestFocus();
                                        }
                                        C0f9.A0A(-1954876737, A0N);
                                    }
                                });
                                View requireViewById2 = inflate.requireViewById(R.id.clear_all_button);
                                final IgTextView igTextView = (IgTextView) requireViewById2;
                                this.clearAllButton = igTextView;
                                C14360o3.A07(requireViewById2);
                                LocalMediaInjectionConstants.InjectionContentType injectionContentType2 = this.contentType;
                                if (injectionContentType2 != null) {
                                    AbstractC31177DnL.A10(igTextView, this, injectionContentType2.getValue(), 2131958171);
                                    C0fQ.A00(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.localinjection.InjectMediaFragment$onCreateView$2
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            String str2;
                                            int A05 = C0f9.A05(1655610973);
                                            Set set = InjectMediaFragment.this.savedInjectedMedia;
                                            if (set != null) {
                                                set.clear();
                                                InjectMediaFragment injectMediaFragment = InjectMediaFragment.this;
                                                LocalMediaInjectionController localMediaInjectionController2 = injectMediaFragment.injectionController;
                                                if (localMediaInjectionController2 == null) {
                                                    str2 = "injectionController";
                                                } else {
                                                    Set set2 = injectMediaFragment.savedInjectedMedia;
                                                    if (set2 != null) {
                                                        LocalMediaInjectionConstants.InjectionContentType injectionContentType3 = injectMediaFragment.contentType;
                                                        if (injectionContentType3 != null) {
                                                            localMediaInjectionController2.selectInjectionItems(set2, injectionContentType3);
                                                            List list3 = InjectMediaFragment.this.injectionUnits;
                                                            if (list3 != null) {
                                                                Iterator it2 = list3.iterator();
                                                                while (it2.hasNext()) {
                                                                    ((LocalInjectionUnit) it2.next()).isSelected = false;
                                                                }
                                                                InjectMediaFragment injectMediaFragment2 = InjectMediaFragment.this;
                                                                InjectionMediaSelectionAdapter injectionMediaSelectionAdapter2 = injectMediaFragment2.injectionMediaSelectionAdapter;
                                                                str2 = "injectionMediaSelectionAdapter";
                                                                if (injectionMediaSelectionAdapter2 != null) {
                                                                    List list4 = injectMediaFragment2.injectionUnits;
                                                                    if (list4 != null) {
                                                                        Set set3 = injectMediaFragment2.savedInjectedMedia;
                                                                        if (set3 != null) {
                                                                            injectionMediaSelectionAdapter2.setMediaInjectionsList(list4, set3);
                                                                            InjectMediaFragment injectMediaFragment3 = InjectMediaFragment.this;
                                                                            InjectionMediaSelectionAdapter injectionMediaSelectionAdapter3 = injectMediaFragment3.injectionMediaSelectionAdapter;
                                                                            if (injectionMediaSelectionAdapter3 != null) {
                                                                                List list5 = injectMediaFragment3.injectionUnits;
                                                                                if (list5 != null) {
                                                                                    injectionMediaSelectionAdapter3.updateList(list5);
                                                                                    Context requireContext2 = InjectMediaFragment.this.requireContext();
                                                                                    InjectMediaFragment injectMediaFragment4 = InjectMediaFragment.this;
                                                                                    LocalMediaInjectionConstants.InjectionContentType injectionContentType4 = injectMediaFragment4.contentType;
                                                                                    if (injectionContentType4 != null) {
                                                                                        C9GR.A09(requireContext2, AbstractC31174DnI.A0w(injectMediaFragment4, injectionContentType4.getValue(), 2131958172));
                                                                                        C0f9.A0C(-838832960, A05);
                                                                                        return;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            C14360o3.A0F("injectionUnits");
                                                            throw C00O.createAndThrow();
                                                        }
                                                        C14360o3.A0F("contentType");
                                                        throw C00O.createAndThrow();
                                                    }
                                                }
                                                C14360o3.A0F(str2);
                                                throw C00O.createAndThrow();
                                            }
                                            C14360o3.A0F("savedInjectedMedia");
                                            throw C00O.createAndThrow();
                                        }
                                    }, igTextView);
                                    View requireViewById3 = inflate.requireViewById(R.id.injection_search_bar);
                                    final IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) requireViewById3;
                                    this.inlineSearchBox = igdsInlineSearchBox;
                                    C14360o3.A07(requireViewById3);
                                    igdsInlineSearchBox.A02 = this;
                                    igdsInlineSearchBox.setImeOptions(6);
                                    triangleSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.instagram.debug.devoptions.section.localinjection.InjectMediaFragment$onCreateView$3
                                        @Override // android.widget.AdapterView.OnItemSelectedListener
                                        public void onNothingSelected(AdapterView adapterView) {
                                        }

                                        @Override // android.widget.AdapterView.OnItemSelectedListener
                                        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
                                            InjectMediaFragment.this.updateList(triangleSpinner, igTextView, igdsInlineSearchBox);
                                        }
                                    });
                                    C0f9.A09(-142296417, A02);
                                    return inflate;
                                }
                            }
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(1471133730, A02);
        throw A0g;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onDestroyView() {
        int A02 = C0f9.A02(-1752806062);
        super.onDestroyView();
        this.inlineSearchBox = null;
        this.surfaceSelector = null;
        this.clearAllButton = null;
        this.searchEmptyState = null;
        C0f9.A09(-1315921167, A02);
    }
}

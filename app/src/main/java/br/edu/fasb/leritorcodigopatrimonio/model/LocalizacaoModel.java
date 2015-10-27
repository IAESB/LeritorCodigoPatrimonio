package br.edu.fasb.leritorcodigopatrimonio.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import br.edu.fasb.leritorcodigopatrimonio.bean.Estado;
import br.edu.fasb.leritorcodigopatrimonio.bean.Localizacao;
import br.edu.fasb.leritorcodigopatrimonio.bean.Objeto;

/**
 * Created by Andre on 25/08/2015.
 */
public class LocalizacaoModel {

    public HashMap<Integer, Localizacao> getLocalizacoesMap()
    {
        HashMap<Integer, Localizacao> map = new HashMap<Integer, Localizacao>();
        map.put(799, new Localizacao(799, 797, "MANUTENÇÃO DE REFRIGERAÇÃO", 						  new Vector<Localizacao>()));
        map.put(876, new Localizacao(876, 797, "ALMOXARIFADO DA OBRA",                                new Vector<Localizacao>()));
        map.put(877, new Localizacao(877, 797, "VESTIÁRIO DA OBRA",                                   new Vector<Localizacao>()));
        map.put(1,   new Localizacao(1,   0,"PREDIO I",                                               new Vector<Localizacao>()));
        map.put(3,   new Localizacao(3,   1,   "ANDAR TÉRREO",                                        new Vector<Localizacao>()));
        map.put(35,  new Localizacao(35,  3,   "COORDENAÇÃO DE PSICOLOGIA",                           new Vector<Localizacao>()));
        map.put(36,  new Localizacao(36,  3,   "COORDENAÇÃO DE EDU. FÍSICA",                          new Vector<Localizacao>()));
        map.put(37,  new Localizacao(37,  3,   "COORDENAÇÃO DE AGRONOMIA",                            new Vector<Localizacao>()));
        map.put(38,  new Localizacao(38,  3,   "COORDENAÇÃO DE FISIOTERAPIA",                         new Vector<Localizacao>()));
        map.put(39,  new Localizacao(39,  3,   "COORDENAÇÃO DE ENFERMAGEM",                           new Vector<Localizacao>()));
        map.put(40,  new Localizacao(40,  3,   "ATENDIMENTO INDIVIDUAL COORD. I",                     new Vector<Localizacao>()));
        map.put(42,  new Localizacao(42,  3,   "RECEPÇÃO DA COORDENAÇÃO I",                           new Vector<Localizacao>()));
        map.put(43,  new Localizacao(43,  3,   "COORDENAÇÃO DE MEDICINA",                             new Vector<Localizacao>()));
        map.put(46,  new Localizacao(46,  3,   "ALMOXARIFADO DE ESCRITÓRIO",                          new Vector<Localizacao>()));
        map.put(47,  new Localizacao(47,  3,   "ATENDIMENTO FINANCEIRO",                              new Vector<Localizacao>()));
        map.put(48,  new Localizacao(48,  3,   "FINANCEIRO",                                          new Vector<Localizacao>()));
        map.put(53,  new Localizacao(53,  3,   "ATENDIMENTO FIES / PROUNI",                           new Vector<Localizacao>()));
        map.put(473, new Localizacao(473, 55,  "COPEVE",                                           new Vector<Localizacao>()));
        map.put(60,  new Localizacao(60,  3,   "ALMOXARIFADO I",                                      new Vector<Localizacao>()));
        map.put(61,  new Localizacao(61,  3,   "CENTRAL DE CÓPIAS",                                   new Vector<Localizacao>()));
        map.put(771, new Localizacao(771, 3,   "SALA DE APOIO",                                       new Vector<Localizacao>()));
        map.put(65,  new Localizacao(65,  3,   "CORREDORES ",                                         new Vector<Localizacao>()));
        map.put(66,  new Localizacao(66,  3,   "SECRETARIA ACADÊMICA",                                new Vector<Localizacao>()));
        map.put(67,  new Localizacao(67,  3,   "COZINHA",                                             new Vector<Localizacao>()));
        map.put(68,  new Localizacao(68,  3,   "REFEITORIO",                                          new Vector<Localizacao>()));
        map.put(777, new Localizacao(777, 3,   "COORDENAÇÃO DE ADMINISTRAÇÃO",                        new Vector<Localizacao>()));
        map.put(71,  new Localizacao(71,  3,   "BIBLIOTECA",                                          new Vector<Localizacao>()));
        map.put(955, new Localizacao(955, 71,  "SALA DE ORIENTAÇÃO 1",                              new Vector<Localizacao>()));
        map.put(957, new Localizacao(957, 71,  "SALA DE ORIENTAÇÃO 2",                              new Vector<Localizacao>()));
        map.put(959, new Localizacao(959, 71,  "ESCRITÓRIO MODELO",                                 new Vector<Localizacao>()));
        map.put(773, new Localizacao(773, 3,   "ARQUIVO MORTO",                                      new Vector<Localizacao>()));
        map.put(74,  new Localizacao(74,  3,   "LABORATÓRIO DE INFORMÁTICA I",                       new Vector<Localizacao>()));
        map.put(141, new Localizacao(141, 3,   "SALA-01",                                            new Vector<Localizacao>()));
        map.put(143, new Localizacao(143, 3,   "SALA-02",                                            new Vector<Localizacao>()));
        map.put(145, new Localizacao(145, 3,   "SALA-03",                                            new Vector<Localizacao>()));
        map.put(147, new Localizacao(147, 3,   "SALA-04",                                            new Vector<Localizacao>()));
        map.put(149, new Localizacao(149, 3,   "SALA-05",                                            new Vector<Localizacao>()));
        map.put(151, new Localizacao(151, 3,   "SALA-06",                                            new Vector<Localizacao>()));
        map.put(153, new Localizacao(153, 3,   "SALA-07",                                            new Vector<Localizacao>()));
        map.put(155, new Localizacao(155, 3,   "SALA-08",                                            new Vector<Localizacao>()));
        map.put(247, new Localizacao(247, 3,   "RECEPÇÃO DA COORDENAÇÃO II",                         new Vector<Localizacao>()));
        map.put(305, new Localizacao(305, 3,   "PORTARIA I",                                         new Vector<Localizacao>()));
        map.put(331, new Localizacao(331, 3,   "ATENDIMENTO INDIVIDUAL COORD. II",                   new Vector<Localizacao>()));
        map.put(539, new Localizacao(539, 3,   "HALL DE ENTRADA",                                    new Vector<Localizacao>()));
        map.put(20,  new Localizacao(20,  3,   "COORDENAÇÃO DE DIREITO",                             new Vector<Localizacao>()));
        map.put(23,  new Localizacao(23,  3,   "COORDENAÇÃO CONTABÉIS",                              new Vector<Localizacao>()));
        map.put(84,  new Localizacao(84,  3,   "COORDENAÇÃO DE EAD",                                 new Vector<Localizacao>()));
        map.put(575, new Localizacao(575, 3,   "COORD. DE COMUNICAÇÃO PUBLICIDADE",                  new Vector<Localizacao>()));
        map.put(579, new Localizacao(579, 3,   "COORD. JORNALISMO",                                  new Vector<Localizacao>()));
        map.put(581, new Localizacao(581, 3,   "SALA DOS PROFESSORES",                               new Vector<Localizacao>()));
        map.put(881, new Localizacao(881, 3,   "COORDENAÇÃO DE GTI",                                 new Vector<Localizacao>()));
        map.put(5,   new Localizacao(5,   1,   "PRIMEIRO ANDAR",                                     new Vector<Localizacao>()));
        map.put(7,   new Localizacao(7,   5,   "PRESIDÊNCIA FASB/IAESB",                              new Vector<Localizacao>()));
        map.put(9,   new Localizacao(9,   5,   "LABORATÓRIO DE RÁDIO",                                new Vector<Localizacao>()));
        map.put(11,  new Localizacao(11,  5,   "NÚCLEO DE MARKETING",                                 new Vector<Localizacao>()));
        map.put(12,  new Localizacao(12,  5,   "ENGENHO",                                             new Vector<Localizacao>()));
        map.put(13,  new Localizacao(13,  5,   "LABORATÓRIO DE FOTOGRAFIA",                           new Vector<Localizacao>()));
        map.put(14,  new Localizacao(14,  5,   "LABORATÓRIO DE TV",                                   new Vector<Localizacao>()));
        map.put(21,  new Localizacao(21,  5,   "COORDENAÇÃO PAP E PAD",                               new Vector<Localizacao>()));
        map.put(769, new Localizacao(769, 21,  "ASSESSORIA PEDAGOGICA",                              new Vector<Localizacao>()));
        map.put(22,  new Localizacao(22,  5,   "ATENDIMENTO DO PAP",                                  new Vector<Localizacao>()));
        map.put(24,  new Localizacao(24,  5,   "LABORATÓRIO DE INFORMÁTICA II",                       new Vector<Localizacao>()));
        map.put(321, new Localizacao(321, 5,   "LABORATÓRIO DE INFORMÁTICA III",                      new Vector<Localizacao>()));
        map.put(26,  new Localizacao(26,  5,   "NÚCLEO TÉCNICO DE INFORMÁTICA",                       new Vector<Localizacao>()));
        map.put(31,  new Localizacao(31,  5,   "COORD. DE PÓS-GRADUAÇÃO E ASS. IAESB",                new Vector<Localizacao>()));
        map.put(33,  new Localizacao(33,  5,   "CORREDORES",                                          new Vector<Localizacao>()));
        map.put(106, new Localizacao(106, 5,   "CPD",                                                 new Vector<Localizacao>()));
        map.put(115, new Localizacao(115, 5,   "SALA-11",                                             new Vector<Localizacao>()));
        map.put(117, new Localizacao(117, 5,   "SALA-12",                                             new Vector<Localizacao>()));
        map.put(119, new Localizacao(119, 5,   "SALA-13",                                             new Vector<Localizacao>()));
        map.put(121, new Localizacao(121, 5,   "SALA-14",                                             new Vector<Localizacao>()));
        map.put(125, new Localizacao(125, 5,   "SALA-15",                                             new Vector<Localizacao>()));
        map.put(135, new Localizacao(135, 5,   "SALA-16",                                             new Vector<Localizacao>()));
        map.put(139, new Localizacao(139, 5,   "SALA-17",                                             new Vector<Localizacao>()));
        map.put(52,  new Localizacao(52,  5,   "DIREÇÃO ADMINISTRATIVA",                              new Vector<Localizacao>()));
        map.put(56,  new Localizacao(56,  5,   "RECEPÇÃO DA DIREÇÃO ACADÊMICA",                       new Vector<Localizacao>()));
        map.put(57,  new Localizacao(57,  5,   "DIREÇÃO ACADÊMICA",                                   new Vector<Localizacao>()));
        map.put(97,  new Localizacao(97,  5,   "COORDENAÇÃO PESQUISA E EXTENSÃO",                     new Vector<Localizacao>()));
        map.put(503, new Localizacao(503, 5,   "RECEP. PÓS GRADUAÇÃO",                                new Vector<Localizacao>()));
        map.put(50,  new Localizacao(50,  5,   "CONTABILIDADE",                                       new Vector<Localizacao>()));
        map.put(51,  new Localizacao(51,  5,   "RECURSOS HUMANOS",                                    new Vector<Localizacao>()));
        map.put(55,  new Localizacao(55,  5,   "ASSESSORIA DA DIREÇÃO ACADÊMICA",                     new Vector<Localizacao>()));
        map.put(8,   new Localizacao(8,   5,   "NÚCLEO DE INFORMÁTICA",                               new Vector<Localizacao>()));
        map.put(559, new Localizacao(559, 5,   "DEPARTAMENTO JURIDICO",                               new Vector<Localizacao>()));
        map.put(62,  new Localizacao(62,  5,   "TELEFONISTAS",                                        new Vector<Localizacao>()));
        map.put(477, new Localizacao(477, 5,   "PESQUISADOR INSTITUCIONAL",                           new Vector<Localizacao>()));
        map.put(583, new Localizacao(583, 5,   "IMPRESSÃO GRÁFICA",                                   new Vector<Localizacao>()));
        map.put(779, new Localizacao(779, 5,   "SALA DE REUNIÃO",                                     new Vector<Localizacao>()));
        map.put(979, new Localizacao(979, 5,   "ADMINISTRAÇÃO",                                       new Vector<Localizacao>()));
        map.put(2,   new Localizacao(2,   0,"PREDIO II",                                             new Vector<Localizacao>()));
        map.put(80,  new Localizacao(80,  4,   "CORREDORES",                                          new Vector<Localizacao>()));
        map.put(311, new Localizacao(311, 4,   "PORTARIA II",                                         new Vector<Localizacao>()));
        map.put(83,  new Localizacao(83,  4,   "APOIO TÉCNICO E MANUTENÇÃO ",                         new Vector<Localizacao>()));
        map.put(89,  new Localizacao(89,  4,   "LABORATÓRIO DE SEMIOLOGIA",                           new Vector<Localizacao>()));
        map.put(90,  new Localizacao(90,  4,   "LABORATÓRIO DE SOLOS SEMENTES",                       new Vector<Localizacao>()));
        map.put(93,  new Localizacao(93,  4,   "ALMOXARIFADO II",                                     new Vector<Localizacao>()));
        map.put(189, new Localizacao(189, 4,   "SALA-01",                                             new Vector<Localizacao>()));
        map.put(191, new Localizacao(191, 4,   "SALA-02",                                             new Vector<Localizacao>()));
        map.put(193, new Localizacao(193, 4,   "SALA-03",                                             new Vector<Localizacao>()));
        map.put(195, new Localizacao(195, 4,   "SALA-04",                                             new Vector<Localizacao>()));
        map.put(197, new Localizacao(197, 4,   "SALA-05",                                             new Vector<Localizacao>()));
        map.put(199, new Localizacao(199, 4,   "SALA-06",                                             new Vector<Localizacao>()));
        map.put(201, new Localizacao(201, 4,   "SALA-07",                                             new Vector<Localizacao>()));
        map.put(203, new Localizacao(203, 4,   "SALA-08",                                             new Vector<Localizacao>()));
        map.put(205, new Localizacao(205, 4,   "SALA DE PÓS",                                         new Vector<Localizacao>()));
        map.put(207, new Localizacao(207, 4,   "SALA-10",                                             new Vector<Localizacao>()));
        map.put(209, new Localizacao(209, 4,   "SALA-11",                                             new Vector<Localizacao>()));
        map.put(159, new Localizacao(159, 4,   "SALA-12",                                             new Vector<Localizacao>()));
        map.put(157, new Localizacao(157, 4,   "SALA-13",                                             new Vector<Localizacao>()));
        map.put(543, new Localizacao(543, 4,   "HALL DE ENTRADA",                                     new Vector<Localizacao>()));
        map.put(761, new Localizacao(761, 4,   "DEPÓSITO DE MATERIAIS",                               new Vector<Localizacao>()));
        map.put(783, new Localizacao(783, 4,   "LIMPEZA INTERNA",                                     new Vector<Localizacao>()));
        map.put(941, new Localizacao(941, 4,   "LABORATÓRIO DE HADWARE",                              new Vector<Localizacao>()));
        map.put(101, new Localizacao(101, 4,   "ORIENTAÇÃO DE MONOGRAFIA",                            new Vector<Localizacao>()));
        map.put(54,  new Localizacao(54,  4,   " PATRIMÔNIO",                                         new Vector<Localizacao>()));
        map.put(82,  new Localizacao(82,  4,   "COORD. AMIGOS DO BRASIL",                             new Vector<Localizacao>()));
        map.put(981, new Localizacao(981, 4,   "LAB. DE HABILIDADE",                                  new Vector<Localizacao>()));
        map.put(6,   new Localizacao(6,   2,   "PRIMEIRO ANDAR",                                      new Vector<Localizacao>()));
        map.put(94,  new Localizacao(94,  6,   "CORREDORES",                                          new Vector<Localizacao>()));
        map.put(100, new Localizacao(100, 6,   "ARQUIVO MORTO II",                                    new Vector<Localizacao>()));
        map.put(104, new Localizacao(104, 6,   "FASB ACONTECER",                                      new Vector<Localizacao>()));
        map.put(767, new Localizacao(767, 6,   "COMITÊ DE ÉTICA E PESQUISA",                          new Vector<Localizacao>()));
        map.put(655, new Localizacao(655, 6,   "DA DIREITO",                                          new Vector<Localizacao>()));
        map.put(317, new Localizacao(317, 6,   "DEPARTAMENTO SEGURANÇA",                              new Vector<Localizacao>()));
        map.put(223, new Localizacao(223, 317, "GUARITA",                                             new Vector<Localizacao>()));
        map.put(163, new Localizacao(163, 6,   "SALA-14",                                             new Vector<Localizacao>()));
        map.put(165, new Localizacao(165, 6,   "SALA-15",                                             new Vector<Localizacao>()));
        map.put(167, new Localizacao(167, 6,   "SALA-16",                                             new Vector<Localizacao>()));
        map.put(169, new Localizacao(169, 6,   "SALA-17",                                             new Vector<Localizacao>()));
        map.put(171, new Localizacao(171, 6,   "SALA-18",                                             new Vector<Localizacao>()));
        map.put(173, new Localizacao(173, 6,   "SALA-19",                                             new Vector<Localizacao>()));
        map.put(175, new Localizacao(175, 6,   "SALA-20",                                             new Vector<Localizacao>()));
        map.put(177, new Localizacao(177, 6,   "SALA-21",                                             new Vector<Localizacao>()));
        map.put(179, new Localizacao(179, 6,   "SALA-22",                                             new Vector<Localizacao>()));
        map.put(181, new Localizacao(181, 6,   "SALA-23",                                             new Vector<Localizacao>()));
        map.put(183, new Localizacao(183, 6,   "SALA-24",                                             new Vector<Localizacao>()));
        map.put(185, new Localizacao(185, 6,   "SALA-25",                                             new Vector<Localizacao>()));
        map.put(187, new Localizacao(187, 6,   "SALA-26",                                             new Vector<Localizacao>()));
        map.put(647, new Localizacao(647, 6,   "SALA 27",                                             new Vector<Localizacao>()));
        map.put(649, new Localizacao(649, 6,   "SALA 28",                                             new Vector<Localizacao>()));
        map.put(653, new Localizacao(653, 6,   "SALA 29",                                             new Vector<Localizacao>()));
        map.put(98,  new Localizacao(98,  2,   "COORDENAÇÃO DE PEDAGOGIA",                            new Vector<Localizacao>()));
        map.put(86,  new Localizacao(86,  6,   "LABORATÓRIO DE DESENHO",                              new Vector<Localizacao>()));
        map.put(4,   new Localizacao(4,   2,   "PREDIO II TÉRREO",                                    new Vector<Localizacao>()));
        map.put(297, new Localizacao(297, 0,"LAB.SAÚDE (ÁREA EXTERNA)",                               new Vector<Localizacao>()));
        map.put(345, new Localizacao(345, 297, "LAB. SAÚDE ÁREA EXTERNA",                             new Vector<Localizacao>()));
        map.put(585, new Localizacao(585, 0,"GINÁSIO DE ESPORTES",                                         new Vector<Localizacao>()));
        map.put(261, new Localizacao(261, 255, "1º ANDAR",                                                 new Vector<Localizacao>()));
        map.put(807, new Localizacao(807, 585, "SALA DE GINÁSTICA E DANÇA",                                new Vector<Localizacao>()));
        map.put(461, new Localizacao(461, 261, "COZINHA U.S",                                            new Vector<Localizacao>()));
        map.put(697, new Localizacao(697, 261, "ADMINISTRATIVO U. S.",                                   new Vector<Localizacao>()));
        map.put(699, new Localizacao(699, 261, "CPA",                                                    new Vector<Localizacao>()));
        map.put(757, new Localizacao(757, 261, "BALCÃO DA CIDADANIA",                                    new Vector<Localizacao>()));
        map.put(809, new Localizacao(809, 585, "VESTIÁRIO MASCULINO",                                   new Vector<Localizacao>()));
        map.put(263, new Localizacao(263, 255, "TÉRREO",                                                new Vector<Localizacao>()));
        map.put(439, new Localizacao(439, 263, "RECEPÇÃO UNIDADE SERVIÇO",                              new Vector<Localizacao>()));
        map.put(681, new Localizacao(681, 263, "SECRETÁRIA BALCÃO DE JUSTIÇA",                          new Vector<Localizacao>()));
        map.put(719, new Localizacao(719, 263, "SUPERVISÃO BALCÃO DE JUSTIÇA",                          new Vector<Localizacao>()));
        map.put(683, new Localizacao(683, 263, "COORD. UAMI",                                           new Vector<Localizacao>()));
        map.put(701, new Localizacao(701, 263, "SALA DE INFORMÁTICA U.S.",                              new Vector<Localizacao>()));
        map.put(703, new Localizacao(703, 263, "DEPÓSITO I UNIDADE  SERVIÇO",                           new Vector<Localizacao>()));
        map.put(691, new Localizacao(691, 263, "CONCILIAÇÃO BALCÃO DE JUSTIÇA I",                       new Vector<Localizacao>()));
        map.put(617, new Localizacao(617, 263, "RECEP. DE FISIOTERAPIA U.S.",                           new Vector<Localizacao>()));
        map.put(695, new Localizacao(695, 263, "CLINICA DE FISIOTERAPIA U.S.",                          new Vector<Localizacao>()));
        map.put(759, new Localizacao(759, 263, "SALA DE ESTÁGIARIOS FISIOTERÁPIA U.S.",                 new Vector<Localizacao>()));
        map.put(763, new Localizacao(763, 263, "CONCILIAÇÃO BALCÃO DE JUSTIÇA II",                      new Vector<Localizacao>()));
        map.put(885, new Localizacao(885, 263, "ALMOXARIFADO BALCÃO DE JUSTIÇA",                        new Vector<Localizacao>()));
        map.put(907, new Localizacao(907, 263, "CIOB",                                                  new Vector<Localizacao>()));
        map.put(913, new Localizacao(913, 263, "SALA DE ESTAGIÁRIOS NPJ",                               new Vector<Localizacao>()));
        map.put(915, new Localizacao(915, 263, "SALA DE PROFESSORES NPJ",                               new Vector<Localizacao>()));
        map.put(919, new Localizacao(919, 263, "SALA 32",                                               new Vector<Localizacao>()));
        map.put(921, new Localizacao(921, 263, "SALA 33",                                               new Vector<Localizacao>()));
        map.put(923, new Localizacao(923, 263, "SALA DA LOTÉRICA",                                      new Vector<Localizacao>()));
        map.put(925, new Localizacao(925, 263, "SALA DOS VIGIAS",                                       new Vector<Localizacao>()));
        map.put(811, new Localizacao(811, 585, "VESTIÁRIO FEMININO",                                   new Vector<Localizacao>()));
        map.put(265, new Localizacao(265, 255, "CLINICA DE PSICOLOGIA",                                new Vector<Localizacao>()));
        map.put(391, new Localizacao(391, 265, "SALA SUPERVISÃO PSICOLOGIA U.S.",                     new Vector<Localizacao>()));
        map.put(393, new Localizacao(393, 265, "SALA DE ESTAGIÁRIOS PSICOLOGIA U.S.",                 new Vector<Localizacao>()));
        map.put(395, new Localizacao(395, 265, "SALA DE ATEND.ADULTO U.S.",                           new Vector<Localizacao>()));
        map.put(397, new Localizacao(397, 265, "SALA DE ATEND. INDIVIDUAL U.S.",                      new Vector<Localizacao>()));
        map.put(399, new Localizacao(399, 265, "SALA DE DESENVOLVIMENTO HUMANO EM GRUPO U.S.",        new Vector<Localizacao>()));
        map.put(411, new Localizacao(411, 265, "AUDITÓRIO",                                             new Vector<Localizacao>()));
        map.put(415, new Localizacao(415, 265, "SALA DE ATENDIMENTO INFANTIL U.S.",                   new Vector<Localizacao>()));
        map.put(417, new Localizacao(417, 265, "SALA DOS PROFESSORES U.S.",                           new Vector<Localizacao>()));
        map.put(429, new Localizacao(429, 265, "COORD. PSICOLOGIA U.S",                               new Vector<Localizacao>()));
        map.put(431, new Localizacao(431, 265, "SALA DE AULA U.S",                                    new Vector<Localizacao>()));
        map.put(671, new Localizacao(671, 265, "SALA DE ESPERA DE PSICOLOGIA U.S.",                   new Vector<Localizacao>()));
        map.put(471, new Localizacao(471, 265, "SECRETÁRIA PSICOLOGIA",                               new Vector<Localizacao>()));
        map.put(673, new Localizacao(673, 265, "SALA DE ATEND. PSICOLOGIA U.S.",                      new Vector<Localizacao>()));
        map.put(677, new Localizacao(677, 265, "SALA DE ATEND. INDIVIDUAL I U.S.",                    new Vector<Localizacao>()));
        map.put(679, new Localizacao(679, 265, "SALA DE ATEND. INDIVIDUAL II U.S.",                   new Vector<Localizacao>()));
        map.put(879, new Localizacao(879, 585, "SALA DE MATERIAL ESPORTIVO",                           new Vector<Localizacao>()));
        map.put(931, new Localizacao(931, 585, "DEPÓSITO II MATERIAL FORA DE USO",                     new Vector<Localizacao>()));
        map.put(935, new Localizacao(935, 585, "ADESFF",                                               new Vector<Localizacao>()));
        map.put(747, new Localizacao(747, 255, "NÚCLEO DE PRÁTICA JÚRIDICA",                           new Vector<Localizacao>()));
        map.put(685, new Localizacao(685, 747, "RECEP. DE DIREITO",                                    new Vector<Localizacao>()));
        map.put(687, new Localizacao(687, 747, "ATEND. DE DIREITO",                                    new Vector<Localizacao>()));
        map.put(689, new Localizacao(689, 747, "COORD. NÚCLEO DE PRÁTICA JÚRIDICA",                    new Vector<Localizacao>()));
        map.put(693, new Localizacao(693, 747, "PASTORAL CARCERÁRIA",                                  new Vector<Localizacao>()));
        map.put(269, new Localizacao(269, 747, "ARQUIVO MORTO NÚCLEO PRÁTICA JÚRIDICA",                new Vector<Localizacao>()));
        map.put(271, new Localizacao(271, 747, "BIBLIOTECA NÚCLEO PRÁTICA JÚRIDICA",                   new Vector<Localizacao>()));
        map.put(273, new Localizacao(273, 747, "SECRETÁRIA NÚCLEO PRÁTICA JÚRIDICA",                   new Vector<Localizacao>()));
        map.put(419, new Localizacao(419, 747, "SALA DE CONCILIAÇÃO SEGREDO DE JUSTIÇA",               new Vector<Localizacao>()));
        map.put(459, new Localizacao(459, 747, "SALA AUDIÊNCIA JÚRI SIMULADO",                         new Vector<Localizacao>()));
        map.put(797, new Localizacao(797, 0,"SETORES DA OBRA",                                    new Vector<Localizacao>()));
        map.put(349, new Localizacao(349, 297, "COORD.MEDICINA",                                      new Vector<Localizacao>()));
        map.put(351, new Localizacao(351, 297, "LAB.QUÍMICA BIOQUÍMICA",                              new Vector<Localizacao>()));
        map.put(353, new Localizacao(353, 297, "LAB.MICROBIOLOGIA",                                   new Vector<Localizacao>()));
        map.put(355, new Localizacao(355, 297, "LAB.BIOFÍSICA",                                       new Vector<Localizacao>()));
        map.put(357, new Localizacao(357, 297, "LAB.BIOTECNOLOGIA",                                   new Vector<Localizacao>()));
        map.put(359, new Localizacao(359, 297, "LAB.COMPORT. EXPERIMENTAL",                           new Vector<Localizacao>()));
        map.put(597, new Localizacao(597, 297, "LAB. ANATOMOFISIOLOGIA I",                            new Vector<Localizacao>()));
        map.put(599, new Localizacao(599, 297, "RECEP. DA COORD. MEDICINA",                           new Vector<Localizacao>()));
        map.put(601, new Localizacao(601, 297, "SALA DOS PROFESSORES MEDICINA",                       new Vector<Localizacao>()));
        map.put(88,  new Localizacao(88,  297, "LABORATÓRIO DE TERAPÊUTICA",                          new Vector<Localizacao>()));
        map.put(659, new Localizacao(659, 297, "SALA DE CIRURGIA",                                    new Vector<Localizacao>()));
        map.put(661, new Localizacao(661, 297, "SALA DE TÉCNICAS ESTRUMENTAIS",                       new Vector<Localizacao>()));
        map.put(663, new Localizacao(663, 297, "SALA DE AULA MEDICINA",                               new Vector<Localizacao>()));
        map.put(667, new Localizacao(667, 297, "DEPÓSITO MEDICINA",                                   new Vector<Localizacao>()));
        map.put(669, new Localizacao(669, 297, "LAB. ANATOMOFISIOLOGIA II",                           new Vector<Localizacao>()));
        map.put(603, new Localizacao(603, 297, "ATENDIMENTO INDIVIDUAL MEDICINA",                     new Vector<Localizacao>()));
        map.put(929, new Localizacao(929, 297, "LAB.TECNOLOGIA DE ALIMENTO",                          new Vector<Localizacao>()));
        map.put(987, new Localizacao(987, 297, "LAB. BIOMEDICINA",                                    new Vector<Localizacao>()));
        map.put(255, new Localizacao(255, 0,"UNIDADE DE SERVIÇO",                                 new Vector<Localizacao>()));

        return map;
    }

    public Vector<Localizacao> getLocalizacoesVec()
    {
        HashMap<Integer, Localizacao> map = getLocalizacoesMap();
        Vector<Localizacao> vec = new Vector<>();
        for (Map.Entry<Integer, Localizacao> par: map.entrySet()){
            Localizacao loc = par.getValue();
            Localizacao pai = map.get(loc.getPai());
            if(pai != null){
                pai.getFilhos().add(loc);
            }else {
                vec.add(par.getValue());
            }
        }

        return vec;
    }

    public void exportCsv(Localizacao localizacao, String dirPath) throws FileNotFoundException {
        File dir = new File(dirPath);
        dir.mkdirs();
        PrintWriter file = new PrintWriter(dirPath+'/'+localizacao.getId()+".csv");
        for(Objeto obj: localizacao.getObjetos()){
            file.write(obj.getEtiqueta()+ "|1|"+localizacao.getId()+'|'+obj.getEstado().ordinal()+'\n');
        }
        file.flush();
        file.close();
        if(localizacao.getObjetos().isEmpty())
            new File(dirPath+'/'+localizacao.getId()+".csv").delete();
    }

    public void inportCsv(Localizacao localizacao, String dirStorageFiles) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader(dirStorageFiles+'/'+localizacao.getId()+".csv"));
        String line;
        Vector<Objeto> objetos = new Vector<>();
        while( (line =file.readLine()) != null){
            String[] campos = line.split("\\|");
            objetos.add( new Objeto(campos[0], localizacao, Estado.values()[Integer.parseInt(campos[3])]) );
        }
        localizacao.setObjetos(objetos);
    }
}
